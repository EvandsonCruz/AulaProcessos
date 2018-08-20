package view;

import controler.ProcController;

public class Principal {

	public static void main(String[] args) {
		ProcController pCont = new ProcController();
//		pCont.prop();
//		String path = "TASKLIST /FO TABLE";
//		String path = "C:\\Windows\\regedit.exe";
//		pCont.leProcesso(path);
//		pCont.chamaProcesso(path);
		String infoProcesso = "notepad.exe";
		pCont.mataProcesso(infoProcesso);
	}

}
