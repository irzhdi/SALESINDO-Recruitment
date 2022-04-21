package com.juaracoding.SALESINDO.utlis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${user}")
	private String userName;
	
	@Value("${txtWelcome}")
	private String txtWelcome;
	
	@Value("${txtViewDetail}")
	private String txtViewDetail;
	
	@Value("${txtVerifikasiData}")
	private String txtVerifikasiData;
	
	@Value("${txtJadwalTraining}")
	private String txtJadwalTraining;
	
	@Value("${txtSukses}")
	private String txtSukses;
	
	@Value("${txtGenerateCoding}")
	private String txtGenerateCoding;
	
	
//===========================================================================================
	public String getBrowser() {
		return browser;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public String getTxtWelcome() {
		return txtWelcome;
	}
	
	public String getTxtViewDetail() {
		return txtViewDetail;
	}
	public String getTxtVerifikasiData() {
		return txtVerifikasiData;
	}
	
	public String getTxtJadwalTraining() {
		return txtJadwalTraining;
	}
	public String getTxtSukses() {
		return txtSukses;
	}
	
	public String getTxtGenerateCoding() {
		return txtGenerateCoding;
	}
	
}
