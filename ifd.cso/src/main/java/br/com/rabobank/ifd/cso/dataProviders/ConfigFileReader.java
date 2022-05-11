package br.com.rabobank.ifd.cso.dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import br.com.rabobank.ifd.cso.enums.DriverType;

public class ConfigFileReader {

	private Properties prop;
	private final String local = "config//Configuration.properties";

	public ConfigFileReader() {
		BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader(local));
			prop = new Properties();

			try {
				prop.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuracao.properties não encontrado em " + local);
		}
	}

	public String getUrl() {
		String url = prop.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url não especificada no arquivo Configuracao.properties.");
	}

	public DriverType getBrowser() {
		String browserName = prop.getProperty("browser");
		if (browserName == null || browserName.equals("chrome"))
			return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equals("iexplorer"))
			return DriverType.INTERNETEXPLORER;
		else if (browserName.equals("edge"))
			return DriverType.EDGE;
		else
			throw new RuntimeException(
					"Valor da chave e nome do navegador em Configuracao.properties não corresponde: " + browserName);
	}

	public Boolean getBrowserWindowSize() {
		String windowSize = prop.getProperty("windowMaximize");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}

	public long getImplicitlyWait() {
		String implicitlyWait = prop.getProperty("implicitlyWait");
		if (implicitlyWait != null) {
			try {
				return Long.parseLong(implicitlyWait);
			} catch (NumberFormatException e) {
				throw new RuntimeException("Não é possível analisar o valor : " + implicitlyWait + "dentro do tempo");
			}
		}
		return 30;
	}

	public String getReportConfigPath() {
		String reportConfigPath = System.getProperty("user.dir") + prop.getProperty("caminhoExtendConfig");
		return reportConfigPath;
	}
	
	public String getUsuario() {
		String usuario = prop.getProperty("usuario");
		return usuario;
	}
	
	public String getSenha() {
		String senha = prop.getProperty("senha");
		return senha;
	}

}