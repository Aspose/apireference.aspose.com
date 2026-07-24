---
title: "System::Xml::XmlWriterSettings klass"
linktitle: "XmlWriterSettings"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlWriterSettings klass. Anger en uppsättning funktioner som ska stödjas på XmlWriter‑objektet som skapas av XmlWriter::Create‑metoden i C++."
type: docs
weight: 4500
url: /sv/cpp/system.xml/xmlwritersettings/
---
## XmlWriterSettings class


Anger en uppsättning funktioner som ska stödjas på [XmlWriter](../xmlwriter/)‑objektet som skapas av [XmlWriter::Create](../xmlwriter/create/)‑metoden.

```cpp
class XmlWriterSettings : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clone](./clone/)() | Skapar en kopia av [XmlWriterSettings](./)‑instansen. |
| [get_CheckCharacters](./get_checkcharacters/)() | Returnerar ett värde som indikerar om XML‑skrivaren ska kontrollera att alla tecken i dokumentet följer avsnittet "2.2 Characters" i W3C:s [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets). |
| [get_CloseOutput](./get_closeoutput/)() | Returnerar ett värde som indikerar om [XmlWriter](../xmlwriter/) också ska stänga den underliggande strömmen eller TextWriter när [XmlWriter::Close](../xmlwriter/close/)‑metoden anropas. |
| [get_ConformanceLevel](./get_conformancelevel/)() | Returnerar den nivå av överensstämmelse som XML‑skrivaren kontrollerar XML‑utdata mot. |
| [get_DoNotEscapeUriAttributes](./get_donotescapeuriattributes/)() | Returnerar ett värde som indikerar om [XmlWriter](../xmlwriter/) inte kodar URI‑attribut. |
| [get_Encoding](./get_encoding/)() | Returnerar vilken typ av textkodning som ska användas. |
| [get_Indent](./get_indent/)() | Returnerar ett värde som indikerar om element ska indenteras. |
| [get_IndentChars](./get_indentchars/)() | Returnerar teckensträngen som ska användas vid indentering. Denna inställning används när värdet för [XmlWriterSettings::set_Indent](./set_indent/) är satt till **true**. |
| [get_NamespaceHandling](./get_namespacehandling/)() | Returnerar ett värde som indikerar om [XmlWriter](../xmlwriter/) ska ta bort dubblett‑namnrymdsdeklarationer när XML‑innehåll skrivs. Standardbeteendet är att skrivaren skriver ut alla namnrymdsdeklarationer som finns i skrivarens namnrymdslösare. |
| [get_NewLineChars](./get_newlinechars/)() | Returnerar teckensträngen som ska användas för radbrytningar. |
| [get_NewLineHandling](./get_newlinehandling/)() | Returnerar ett värde som indikerar om radbrytningar i utdata ska normaliseras. |
| [get_NewLineOnAttributes](./get_newlineonattributes/)() | Returnerar ett värde som indikerar om attribut ska skrivas på en ny rad. |
| [get_OmitXmlDeclaration](./get_omitxmldeclaration/)() | Returnerar ett värde som indikerar om en XML‑deklaration ska utelämnas. |
| [get_OutputMethod](./get_outputmethod/)() | Returnerar metoden som används för att serialisera [XmlWriter](../xmlwriter/)‑utdata. |
| [get_WriteEndDocumentOnClose](./get_writeenddocumentonclose/)() | Returnerar ett värde som indikerar om [XmlWriter](../xmlwriter/) kommer att lägga till avslutande taggar för alla oavslutade elementtaggar när [XmlWriter::Close](../xmlwriter/close/)‑metoden anropas. |
| [Reset](./reset/)() | Återställer medlemmarna i inställningsklassen till deras standardvärden. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | Anger ett värde som indikerar om XML‑skrivaren ska kontrollera att alla tecken i dokumentet följer avsnittet "2.2 Characters" i W3C:s [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets). |
| [set_CloseOutput](./set_closeoutput/)(bool) | Anger ett värde som indikerar om [XmlWriter](../xmlwriter/) också ska stänga den underliggande strömmen eller TextWriter när [XmlWriter::Close](../xmlwriter/close/)‑metoden anropas. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | Anger den nivå av överensstämmelse som XML‑skrivaren kontrollerar XML‑utdata mot. |
| [set_DoNotEscapeUriAttributes](./set_donotescapeuriattributes/)(bool) | Anger ett värde som indikerar om [XmlWriter](../xmlwriter/) inte kodar URI‑attribut. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Anger vilken typ av textkodning som ska användas. |
| [set_Indent](./set_indent/)(bool) | Anger ett värde som indikerar om element ska indenteras. |
| [set_IndentChars](./set_indentchars/)(const String\&) | Ställer in teckensträngen som ska användas vid indentering. Denna inställning används när värdet för [XmlWriterSettings::set_Indent](./set_indent/) är satt till **true**. |
| [set_NamespaceHandling](./set_namespacehandling/)(System::Xml::NamespaceHandling) | Ställer in ett värde som anger om [XmlWriter](../xmlwriter/) ska ta bort duplicerade namnrymdsdeklarationer när XML-innehåll skrivs. Standardbeteendet är att skrivaren skriver ut alla namnrymdsdeklarationer som finns i skrivarens namnrymdslösare. |
| [set_NewLineChars](./set_newlinechars/)(const String\&) | Ställer in teckensträngen som ska användas för radbrytningar. |
| [set_NewLineHandling](./set_newlinehandling/)(System::Xml::NewLineHandling) | Ställer in ett värde som anger om radbrytningar ska normaliseras i utdata. |
| [set_NewLineOnAttributes](./set_newlineonattributes/)(bool) | Ställer in ett värde som anger om attribut ska skrivas på en ny rad. |
| [set_OmitXmlDeclaration](./set_omitxmldeclaration/)(bool) | Ställer in ett värde som anger om en XML-deklaration ska utelämnas. |
| [set_WriteEndDocumentOnClose](./set_writeenddocumentonclose/)(bool) | Ställer in ett värde som anger om [XmlWriter](../xmlwriter/) kommer att lägga till avslutningstaggar för alla oavslutade elementtaggar när metoden [XmlWriter::Close](../xmlwriter/close/) anropas. |
| [XmlWriterSettings](./xmlwritersettings/)() | Initierar en ny instans av klassen [XmlWriterSettings](./). |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Ptr](./ptr/) | Ett alias för delad pekare till en instans av denna klass. |
## Anmärkningar



Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../../system/makeobject/). Skapa aldrig instanser av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

## Se även

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
