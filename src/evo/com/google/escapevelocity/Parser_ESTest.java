/*
* This file was automatically generated by EvoSuite
* Thu Feb 27 17:45:27 GMT 2020
*/

package com.google.escapevelocity;

import com.google.common.collect.ImmutableSortedMap;
import com.google.escapevelocity.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.evosuite.runtime.EvoAssertions.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Parser_ESTest extends Parser_ESTest_scaffolding {

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O único comporamento verificado é se o teste pode ser executado no tempo de 4s; O que não parece viável para
    *     um teste que apenas faz parse de uma string pequena.
    *
    * Compreensivel: sim
    *     - Tanto o comportamento do teste quanto suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        StringReader stringReader0 = new StringReader("!=");
        Parser parser0 = new Parser(stringReader0, "CharMatcher.isNot('", (Template.ResourceOpener) null);
        parser0.parse();
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     a chamada ao método parser() stringReader0 finalizada lança uma IOException.
    *
    * Compreensivel: sim
    *     - Tanto o comportamento do teste quanto suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        StringReader stringReader0 = new StringReader("wvijJ2a0#*80VY");
        Template.ResourceOpener template_ResourceOpener0 = mock(Template.ResourceOpener.class, new ViolatedAssumptionAnswer());
        Parser parser0 = new Parser(stringReader0, "wvijJ2a0#*80VY", template_ResourceOpener0);
        stringReader0.close();
        try {
            parser0.parse();
            fail("Expecting exception: IOException");

        } catch (IOException e) {
            //
            // Stream closed
            //
            verifyException("java.io.StringReader", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     o construtor de Parse chamados com valores inválidos lança uma NullPointerException.
    *
    * Compreensivel: sim
    *     - Tanto o comportamento do teste quanto suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Template.ResourceOpener template_ResourceOpener0 = mock(Template.ResourceOpener.class, new ViolatedAssumptionAnswer());
        Parser parser0 = null;
        try {
            parser0 = new Parser((Reader) null, "Undefined reference $", template_ResourceOpener0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.io.Reader", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     o construtor de Parse chamados com valores inválidos lança uma IOException.
    *
    * Compreensivel: sim
    *     - Tanto o comportamento do teste quanto suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        StringReader stringReader0 = new StringReader("e{uWKBk.m9/G8?l");
        stringReader0.close();
        Template.ResourceOpener template_ResourceOpener0 = mock(Template.ResourceOpener.class, new ViolatedAssumptionAnswer());
        Parser parser0 = null;
        try {
            parser0 = new Parser(stringReader0, "f+%,", template_ResourceOpener0);
            fail("Expecting exception: IOException");

        } catch (Throwable e) {
            //
            // Stream closed
            //
            verifyException("java.io.StringReader", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O único comporamento verificado é se o teste pode ser executado no tempo de 4s; O que não parece viável para
    *     um teste que apenas faz parse de uma string pequena.
    *
    * Compreensivel: sim
    *     - Tanto o comportamento do teste quanto suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test04() throws Throwable {
        StringReader stringReader0 = new StringReader("${");
        Parser parser0 = new Parser(stringReader0, "${", (Template.ResourceOpener) null);
        parser0.parse();
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O único comporamento verificado é se o teste pode ser executado no tempo de 4s; O que não parece viável para
    *     um teste que apenas faz parse de uma string pequena.
    *
    * Compreensivel: sim
    *     - Tanto o comportamento do teste quanto suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        StringReader stringReader0 = new StringReader("s$*%)Xsf");
        Template.ResourceOpener template_ResourceOpener0 = mock(Template.ResourceOpener.class, new ViolatedAssumptionAnswer());
        Parser parser0 = new Parser(stringReader0, "s$*%)Xsf", template_ResourceOpener0);
        parser0.parse();
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O único comporamento verificado é se o teste pode ser executado no tempo de 4s; O que não parece viável para
    *     um teste que apenas faz parse de uma string pequena.
    *
    * Compreensivel: sim
    *     - Tanto o comportamento do teste quanto suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test06() throws Throwable {
        StringReader stringReader0 = new StringReader("Directive inside#...}");
        Template.ResourceOpener template_ResourceOpener0 = mock(Template.ResourceOpener.class, new ViolatedAssumptionAnswer());
        Parser parser0 = new Parser(stringReader0, "Directive inside#...}", template_ResourceOpener0);
        parser0.parse();
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     a chamada ao método parse() inicializado com argumentos inválidos lança uma RuntimeException.
    *
    * Compreensivel: sim
    *     - Tanto o comportamento do teste quanto suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test07() throws Throwable {
        StringReader stringReader0 = new StringReader("Directive inside #{...}");
        Template.ResourceOpener template_ResourceOpener0 = mock(Template.ResourceOpener.class, new ViolatedAssumptionAnswer());
        Parser parser0 = new Parser(stringReader0, "Directive inside #{...}", template_ResourceOpener0);
        // Undeclared exception!
        try {
            parser0.parse();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // Directive inside #{...} should start with an ASCII letter, on line 1 of Directive inside #{...}, at text starting: ...}
            //
            verifyException("com.google.escapevelocity.Parser", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     a chamada ao método parse() inicializado com argumentos inválidos lança uma RuntimeException.
    *
    * Compreensivel: sim
    *     - Tanto o comportamento do teste quanto suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test08() throws Throwable {
        StringReader stringReader0 = new StringReader("dlG-O#I");
        Parser parser0 = new Parser(stringReader0, "dlG-O#I", (Template.ResourceOpener) null);
        // Undeclared exception!
        try {
            parser0.parse();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // Unrecognized directive #I, on line 1 of dlG-O#I, at text starting: EOF
            //
            verifyException("com.google.escapevelocity.Parser", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O único comporamento verificado é se o teste pode ser executado no tempo de 4s; O que não parece viável para
    *     um teste que apenas faz parse de uma string pequena.
    *
    * Compreensivel: sim
    *     - Tanto o comportamento do teste quanto suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test09() throws Throwable {
        StringReader stringReader0 = new StringReader("{jcdr$tpK7f/");
        Parser parser0 = new Parser(stringReader0, "C0harMatcher.isNot('", (Template.ResourceOpener) null);
        parser0.parse();
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste é complexo de ser compreendido.
    *
    * Compreensivel: não
    *     - Tanto o comportamento do teste não é compreensível, já suas instruções são parcialmente compreesíveis.
    */
    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Parser.CommentNode parser_CommentNode0 = new Parser.CommentNode((String) null, 42);
        ImmutableSortedMap<String, Macro> immutableSortedMap0 = ImmutableSortedMap.of();
        MethodFinder methodFinder0 = new MethodFinder();
        EvaluationContext.PlainEvaluationContext evaluationContext_PlainEvaluationContext0 = new EvaluationContext.PlainEvaluationContext(immutableSortedMap0, immutableSortedMap0, methodFinder0);
        StringBuilder stringBuilder0 = new StringBuilder();
        parser_CommentNode0.render(evaluationContext_PlainEvaluationContext0, stringBuilder0);
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *    o resultado obtido com a chamada do método parse() é diferente de nulo.
    *
    * Compreensivel: sim
    *     - Tanto o comportamento do teste quanto suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test11() throws Throwable {
        StringReader stringReader0 = new StringReader("wvijJ2a0#*80VY");
        Template.ResourceOpener template_ResourceOpener0 = mock(Template.ResourceOpener.class, new ViolatedAssumptionAnswer());
        Parser parser0 = new Parser(stringReader0, "wvijJ2a0#*80VY", template_ResourceOpener0);
        Template template0 = parser0.parse();
        assertNotNull(template0);
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *    o operador MINUS do Parser é igual ao valor esperado.
    *
    * Compreensivel: sim
    *     - Tanto o comportamento do teste quanto suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Parser.Operator parser_Operator0 = Parser.Operator.MINUS;
        String string0 = parser_Operator0.toString();
        assertEquals("-", string0);
    }
}
