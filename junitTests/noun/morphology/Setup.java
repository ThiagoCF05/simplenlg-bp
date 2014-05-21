/*
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * The Original Code is "Simplenlg".
 *
 * The Initial Developer of the Original Code is Ehud Reiter, Albert Gatt and Dave Westwater.
 * Portions created by Ehud Reiter, Albert Gatt and Dave Westwater are Copyright (C) 2010-11 The University of Aberdeen. All Rights Reserved.
 *
 * Contributor(s): Ehud Reiter, Albert Gatt, Dave Wewstwater, Roman Kutlak, Margaret Mitchell.
 */
package noun.morphology;

import junit.framework.TestCase;

import org.junit.Before;

import simplenlg.framework.NLGFactory;
import simplenlg.lexicon.Lexicon;
import simplenlg.lexicon.portuguese.XMLLexicon;
import simplenlg.phrasespec.NPPhraseSpec;
import simplenlg.realiser.Realiser;

/**
 * This class is the base class for all JUnit test cases in this package.
 * @author R. de Oliveira, University of Aberdeen.
 */
public abstract class Setup extends TestCase {
	
	/** The realiser. */
	Realiser realiser;

	NLGFactory phraseFactory;
	
	Lexicon lexicon;
	
	// nouns
	NPPhraseSpec livro,	cidadao, capitao, leao, papel, fossil, funil, carnaval, 
	dom, especimen,	abdomen, cor, lapis, fregues, torax, luz, juiz;

	/**
	 * Instantiates a new SimpleNLG test.
	 * 
	 * @param name
	 *            the name
	 */
	public Setup(String name) {
		super(name);
	}

	/**
	 * Set up the variables we'll need for this SimpleNLG test to run (Called
	 * automatically by JUnit)
	 */
	@Override
	@Before
	protected void setUp() {
		lexicon = new XMLLexicon();
		this.phraseFactory = new NLGFactory(this.lexicon);
		this.realiser = new Realiser();
		
		this.livro = this.phraseFactory.createNounPhrase("livro");
		this.cidadao = this.phraseFactory.createNounPhrase("cidadão");
		this.capitao = this.phraseFactory.createNounPhrase("capitão");
		this.leao = this.phraseFactory.createNounPhrase("leão");
		this.papel = this.phraseFactory.createNounPhrase("papel");
		this.fossil = this.phraseFactory.createNounPhrase("fóssil");
		this.funil = this.phraseFactory.createNounPhrase("funil");
		this.carnaval = this.phraseFactory.createNounPhrase("carnaval");
		this.dom = this.phraseFactory.createNounPhrase("dom");
		this.especimen = this.phraseFactory.createNounPhrase("espécimen");
		this.abdomen = this.phraseFactory.createNounPhrase("abdômen");
		this.cor = this.phraseFactory.createNounPhrase("cor");
		this.lapis = this.phraseFactory.createNounPhrase("lápis");
		this.fregues = this.phraseFactory.createNounPhrase("freguês");
		this.torax = this.phraseFactory.createNounPhrase("tórax");
		this.luz = this.phraseFactory.createNounPhrase("luz");
		this.juiz = this.phraseFactory.createNounPhrase("juiz");

	}
}
