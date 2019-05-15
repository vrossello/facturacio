package org.sito.utils.view;


public class VistaBase {

	public static final String ERROR = "errors/error";

	public static String redirect (String url) {
		return redirect (url, "html");
	}


	public static String redirect (String url, String type) {
		return "redirect:" + url + "." + type;
	}


	/**
	 * Classe no instanciable
	 */
	protected VistaBase() {
		throw new AssertionError();
	}
}
