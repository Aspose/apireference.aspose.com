---
title: "System::Xml::XmlWriterSettings klasse"
linktitle: "XmlWriterSettings"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlWriterSettings klasse. Specificeert een set functies om te ondersteunen op het XmlWriter-object dat is aangemaakt door de XmlWriter::Create-methode in C++."
type: docs
weight: 4500
url: /nl/cpp/system.xml/xmlwritersettings/
---
## XmlWriterSettings class


Specificeert een set functies om te ondersteunen op het [XmlWriter](../xmlwriter/) object dat is aangemaakt door de [XmlWriter::Create](../xmlwriter/create/) methode.

```cpp
class XmlWriterSettings : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() | Maakt een kopie van de [XmlWriterSettings](./) instantie. |
| [get_CheckCharacters](./get_checkcharacters/)() | Retourneert een waarde die aangeeft of de XML-schrijver moet controleren of alle tekens in het document voldoen aan de sectie "2.2 Characters" van de W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets). |
| [get_CloseOutput](./get_closeoutput/)() | Retourneert een waarde die aangeeft of de [XmlWriter](../xmlwriter/) ook de onderliggende stream of TextWriter moet sluiten wanneer de [XmlWriter::Close](../xmlwriter/close/) methode wordt aangeroepen. |
| [get_ConformanceLevel](./get_conformancelevel/)() | Retourneert het conformiteitsniveau dat de XML-schrijver controleert voor de XML-uitvoer. |
| [get_DoNotEscapeUriAttributes](./get_donotescapeuriattributes/)() | Retourneert een waarde die aangeeft of de [XmlWriter](../xmlwriter/) URI-attributen niet ontsnapt. |
| [get_Encoding](./get_encoding/)() | Retourneert het type tekencodering dat moet worden gebruikt. |
| [get_Indent](./get_indent/)() | Retourneert een waarde die aangeeft of elementen moeten worden ingesprongen. |
| [get_IndentChars](./get_indentchars/)() | Retourneert de tekenreeks die moet worden gebruikt bij inspringen. Deze instelling wordt gebruikt wanneer de [XmlWriterSettings::set_Indent](./set_indent/) waarde is ingesteld op **true**. |
| [get_NamespaceHandling](./get_namespacehandling/)() | Retourneert een waarde die aangeeft of de [XmlWriter](../xmlwriter/) dubbele namespace-declaraties moet verwijderen bij het schrijven van XML-inhoud. Het standaardgedrag is dat de schrijver alle namespace-declaraties uitvoert die aanwezig zijn in de namespace-resolver van de schrijver. |
| [get_NewLineChars](./get_newlinechars/)() | Retourneert de tekenreeks die moet worden gebruikt voor regeleinden. |
| [get_NewLineHandling](./get_newlinehandling/)() | Retourneert een waarde die aangeeft of regeleinden in de uitvoer moeten worden genormaliseerd. |
| [get_NewLineOnAttributes](./get_newlineonattributes/)() | Retourneert een waarde die aangeeft of attributen op een nieuwe regel moeten worden geschreven. |
| [get_OmitXmlDeclaration](./get_omitxmldeclaration/)() | Retourneert een waarde die aangeeft of een XML-declaratie moet worden weggelaten. |
| [get_OutputMethod](./get_outputmethod/)() | Retourneert de methode die wordt gebruikt om de uitvoer van de [XmlWriter](../xmlwriter/) te serialiseren. |
| [get_WriteEndDocumentOnClose](./get_writeenddocumentonclose/)() | Retourneert een waarde die aangeeft of de [XmlWriter](../xmlwriter/) sluitags toevoegt aan alle niet-gesloten elementtags wanneer de [XmlWriter::Close](../xmlwriter/close/) methode wordt aangeroepen. |
| [Reset](./reset/)() | Reset de leden van de instellingenklasse naar hun standaardwaarden. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | Stelt een waarde in die aangeeft of de XML-schrijver moet controleren of alle tekens in het document voldoen aan de sectie "2.2 Characters" van de W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets). |
| [set_CloseOutput](./set_closeoutput/)(bool) | Stelt een waarde in die aangeeft of de [XmlWriter](../xmlwriter/) ook de onderliggende stream of TextWriter moet sluiten wanneer de [XmlWriter::Close](../xmlwriter/close/) methode wordt aangeroepen. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | Stelt het conformiteitsniveau in dat de XML-schrijver controleert voor de XML-uitvoer. |
| [set_DoNotEscapeUriAttributes](./set_donotescapeuriattributes/)(bool) | Stelt een waarde in die aangeeft of de [XmlWriter](../xmlwriter/) URI-attributen niet ontsnapt. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Stelt het type tekencodering in dat moet worden gebruikt. |
| [set_Indent](./set_indent/)(bool) | Stelt een waarde in die aangeeft of elementen moeten worden ingesprongen. |
| [set_IndentChars](./set_indentchars/)(const String\&) | Stelt de tekenreeks in die wordt gebruikt bij inspringen. Deze instelling wordt gebruikt wanneer de [XmlWriterSettings::set_Indent](./set_indent/) waarde is ingesteld op **true**. |
| [set_NamespaceHandling](./set_namespacehandling/)(System::Xml::NamespaceHandling) | Stelt een waarde in die aangeeft of de [XmlWriter](../xmlwriter/) dubbele namespace‑declaraties moet verwijderen bij het schrijven van XML‑inhoud. Het standaardgedrag is dat de schrijver alle namespace‑declaraties uitvoert die aanwezig zijn in de namespace‑resolver van de schrijver. |
| [set_NewLineChars](./set_newlinechars/)(const String\&) | Stelt de tekenreeks in die wordt gebruikt voor regeleinden. |
| [set_NewLineHandling](./set_newlinehandling/)(System::Xml::NewLineHandling) | Stelt een waarde in die aangeeft of regeleinden in de uitvoer genormaliseerd moeten worden. |
| [set_NewLineOnAttributes](./set_newlineonattributes/)(bool) | Stelt een waarde in die aangeeft of attributen op een nieuwe regel moeten worden geschreven. |
| [set_OmitXmlDeclaration](./set_omitxmldeclaration/)(bool) | Stelt een waarde in die aangeeft of een XML‑declaratie moet worden weggelaten. |
| [set_WriteEndDocumentOnClose](./set_writeenddocumentonclose/)(bool) | Stelt een waarde in die aangeeft of de [XmlWriter](../xmlwriter/) sluit‑tags toevoegt aan alle niet‑gesloten element‑tags wanneer de [XmlWriter::Close](../xmlwriter/close/) methode wordt aangeroepen. |
| [XmlWriterSettings](./xmlwritersettings/)() | Initialiseert een nieuw exemplaar van de [XmlWriterSettings](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
