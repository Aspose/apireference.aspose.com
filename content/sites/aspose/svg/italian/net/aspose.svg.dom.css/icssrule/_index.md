---
title: Interface ICSSRule
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Dom.Css.ICSSRule interfaccia. Linterfaccia CSSRule è linterfaccia di base astratta per qualsiasi tipo di istruzione CSS. Ciò include sia i set di regole che le atrule. Ci si aspetta che unimplementazione conservi tutte le regole specificate in un foglio di stile CSS anche se la regola non è riconosciuta dal parser. Le regole non riconosciute sono rappresentate utilizzando ilICSSUnknownRule interfaccia.
type: docs
weight: 620
url: /it/net/aspose.svg.dom.css/icssrule/
---
## ICSSRule interface

L'interfaccia CSSRule è l'interfaccia di base astratta per qualsiasi tipo di istruzione CSS. Ciò include sia i set di regole che le at-rule. Ci si aspetta che un'implementazione conservi tutte le regole specificate in un foglio di stile CSS, anche se la regola non è riconosciuta dal parser. Le regole non riconosciute sono rappresentate utilizzando il!:ICSSUnknownRule interfaccia.

```csharp
public interface ICSSRule
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CSSText](../../aspose.svg.dom.css/icssrule/csstext/) { get; set; } | La rappresentazione testuale analizzabile della regola. Questo riflette lo stato attuale della regola e non il suo valore iniziale. |
| [ParentRule](../../aspose.svg.dom.css/icssrule/parentrule/) { get; } | Se questa regola è contenuta all'interno di un'altra regola (ad esempio una regola di stile all'interno di un blocco @media), questa è la regola contenitore. Se questa regola non è nidificata all'interno di altre regole, restituisce null. |
| [ParentStyleSheet](../../aspose.svg.dom.css/icssrule/parentstylesheet/) { get; } | Il foglio di stile che contiene questa regola. |
| [Type](../../aspose.svg.dom.css/icssrule/type/) { get; } | Il tipo di regola, come definito sopra. L'aspettativa è che i metodi di casting specifici dell'associazione possano essere utilizzati per eseguire il cast down da un'istanza dell'interfaccia CSSRule all'interfaccia derivata specifica implicita nel tipo. |

### Guarda anche

* spazio dei nomi [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* assemblea [Aspose.SVG](../../)


