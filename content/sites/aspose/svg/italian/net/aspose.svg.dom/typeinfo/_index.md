---
title: Class TypeInfo
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Dom.TypeInfo classe. TypeInfo rappresenta un tipo referenziato dai nodi Element o Attr specificato negli schemi associati al documento.
type: docs
weight: 1280
url: /it/net/aspose.svg.dom/typeinfo/
---
## TypeInfo class

TypeInfo rappresenta un tipo referenziato dai nodi Element o Attr, specificato negli schemi associati al documento.

```csharp
public class TypeInfo : DOMObject
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [TypeName](../../aspose.svg.dom/typeinfo/typename/) { get; } | Il nome di un tipo dichiarato per l'elemento o attributo associato oppure null se sconosciuto. |
| [TypeNamespace](../../aspose.svg.dom/typeinfo/typenamespace/) { get; } | Ottiene lo spazio dei nomi del tipo. Lo spazio dei nomi del tipo dichiarato per l'elemento o l'attributo associato oppure null se l'elemento non ha una dichiarazione o se non sono disponibili informazioni sullo spazio dei nomi. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| [IsDerivedFrom](../../aspose.svg.dom/typeinfo/isderivedfrom/)(string, string, ulong) | Questo metodo restituisce se esiste una derivazione tra la definizione del tipo di riferimento, ovvero il TypeInfo su cui viene chiamato il metodo, e l'altra definizione del tipo, ovvero quella passata come parametri. |

## Campi

| Nome | Descrizione |
| --- | --- |
| const [DERIVATION_EXTENSION](../../aspose.svg.dom/typeinfo/derivation_extension/) | Se lo schema del documento è un XML Schema [XML Schema Part 1], questa costante rappresenta la derivazione per estensione. |
| const [DERIVATION_LIST](../../aspose.svg.dom/typeinfo/derivation_list/) | Se lo schema del documento è un XML Schema [XML Schema Part 1], questa costante rappresenta l'elenco. |
| const [DERIVATION_RESTRICTION](../../aspose.svg.dom/typeinfo/derivation_restriction/) | Se lo schema del documento è un XML Schema [XML Schema Part 1], questa costante rappresenta la derivazione per restrizione se sono coinvolti tipi complessi, o una restrizione se sono coinvolti tipi semplici. |
| const [DERIVATION_UNION](../../aspose.svg.dom/typeinfo/derivation_union/) | Se lo schema del documento è un XML Schema [XML Schema Part 1], questa costante rappresenta l'unione se sono coinvolti tipi semplici. |

### Guarda anche

* class [DOMObject](../domobject/)
* spazio dei nomi [Aspose.Svg.Dom](../../aspose.svg.dom/)
* assemblea [Aspose.SVG](../../)


