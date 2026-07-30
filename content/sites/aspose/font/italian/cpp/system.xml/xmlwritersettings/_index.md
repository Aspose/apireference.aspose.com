---
title: "System::Xml::XmlWriterSettings class"
linktitle: "XmlWriterSettings"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlWriterSettings class. Specifica un insieme di funzionalità da supportare sull'oggetto XmlWriter creato dal metodo XmlWriter::Create in C++."
type: docs
weight: 4500
url: /it/cpp/system.xml/xmlwritersettings/
---
## XmlWriterSettings class


Specifica un insieme di funzionalità da supportare sull'oggetto [XmlWriter](../xmlwriter/) creato dal metodo [XmlWriter::Create](../xmlwriter/create/).

```cpp
class XmlWriterSettings : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() | Crea una copia dell'istanza [XmlWriterSettings](./). |
| [get_CheckCharacters](./get_checkcharacters/)() | Restituisce un valore che indica se lo scrittore XML deve verificare che tutti i caratteri nel documento siano conformi alla sezione "2.2 Characters" della [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets) del W3C. |
| [get_CloseOutput](./get_closeoutput/)() | Restituisce un valore che indica se il [XmlWriter](../xmlwriter/) deve anche chiudere lo stream o TextWriter sottostante quando viene chiamato il metodo [XmlWriter::Close](../xmlwriter/close/). |
| [get_ConformanceLevel](./get_conformancelevel/)() | Restituisce il livello di conformità per cui lo scrittore XML verifica l'output XML. |
| [get_DoNotEscapeUriAttributes](./get_donotescapeuriattributes/)() | Restituisce un valore che indica se il [XmlWriter](../xmlwriter/) non esegue l'escape degli attributi URI. |
| [get_Encoding](./get_encoding/)() | Restituisce il tipo di codifica del testo da utilizzare. |
| [get_Indent](./get_indent/)() | Restituisce un valore che indica se indentare gli elementi. |
| [get_IndentChars](./get_indentchars/)() | Restituisce la stringa di caratteri da utilizzare durante l'indentazione. Questa impostazione è usata quando il valore [XmlWriterSettings::set_Indent](./set_indent/) è impostato su **true**. |
| [get_NamespaceHandling](./get_namespacehandling/)() | Restituisce un valore che indica se il [XmlWriter](../xmlwriter/) deve rimuovere le dichiarazioni di namespace duplicate durante la scrittura del contenuto XML. Il comportamento predefinito è che lo scrittore emetta tutte le dichiarazioni di namespace presenti nel risolutore di namespace dello scrittore. |
| [get_NewLineChars](./get_newlinechars/)() | Restituisce la stringa di caratteri da utilizzare per le interruzioni di riga. |
| [get_NewLineHandling](./get_newlinehandling/)() | Restituisce un valore che indica se normalizzare le interruzioni di riga nell'output. |
| [get_NewLineOnAttributes](./get_newlineonattributes/)() | Restituisce un valore che indica se scrivere gli attributi su una nuova riga. |
| [get_OmitXmlDeclaration](./get_omitxmldeclaration/)() | Restituisce un valore che indica se omettere una dichiarazione XML. |
| [get_OutputMethod](./get_outputmethod/)() | Restituisce il metodo utilizzato per serializzare l'output di [XmlWriter](../xmlwriter/). |
| [get_WriteEndDocumentOnClose](./get_writeenddocumentonclose/)() | Restituisce un valore che indica se [XmlWriter](../xmlwriter/) aggiungerà i tag di chiusura a tutti i tag di elemento non chiusi quando viene chiamato il metodo [XmlWriter::Close](../xmlwriter/close/). |
| [Reset](./reset/)() | Ripristina i membri della classe delle impostazioni ai loro valori predefiniti. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | Imposta un valore che indica se lo scrittore XML deve verificare che tutti i caratteri nel documento siano conformi alla sezione "2.2 Characters" della [Raccomandazione XML 1.0](https://www.w3.org/TR/REC-xml/#charsets) del W3C. |
| [set_CloseOutput](./set_closeoutput/)(bool) | Imposta un valore che indica se [XmlWriter](../xmlwriter/) deve anche chiudere lo stream sottostante o il TextWriter quando viene chiamato il metodo [XmlWriter::Close](../xmlwriter/close/). |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | Imposta il livello di conformità per cui lo scrittore XML verifica l'output XML. |
| [set_DoNotEscapeUriAttributes](./set_donotescapeuriattributes/)(bool) | Imposta un valore che indica se [XmlWriter](../xmlwriter/) non esegue l'escape degli attributi URI. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Imposta il tipo di codifica del testo da utilizzare. |
| [set_Indent](./set_indent/)(bool) | Imposta un valore che indica se indentare gli elementi. |
| [set_IndentChars](./set_indentchars/)(const String\&) | Imposta la stringa di caratteri da utilizzare durante l'indentazione. Questa impostazione è usata quando il valore [XmlWriterSettings::set_Indent](./set_indent/) è impostato su **true**. |
| [set_NamespaceHandling](./set_namespacehandling/)(System::Xml::NamespaceHandling) | Imposta un valore che indica se [XmlWriter](../xmlwriter/) deve rimuovere le dichiarazioni di namespace duplicate durante la scrittura del contenuto XML. Il comportamento predefinito è che lo scrittore emetta tutte le dichiarazioni di namespace presenti nel risolutore di namespace dello scrittore. |
| [set_NewLineChars](./set_newlinechars/)(const String\&) | Imposta la stringa di caratteri da utilizzare per le interruzioni di riga. |
| [set_NewLineHandling](./set_newlinehandling/)(System::Xml::NewLineHandling) | Imposta un valore che indica se normalizzare le interruzioni di riga nell'output. |
| [set_NewLineOnAttributes](./set_newlineonattributes/)(bool) | Imposta un valore che indica se scrivere gli attributi su una nuova riga. |
| [set_OmitXmlDeclaration](./set_omitxmldeclaration/)(bool) | Imposta un valore che indica se omettere una dichiarazione XML. |
| [set_WriteEndDocumentOnClose](./set_writeenddocumentonclose/)(bool) | Imposta un valore che indica se [XmlWriter](../xmlwriter/) aggiungerà i tag di chiusura a tutti i tag di elemento non chiusi quando viene chiamato il metodo [XmlWriter::Close](../xmlwriter/close/). |
| [XmlWriterSettings](./xmlwritersettings/)() | Inizializza una nuova istanza della classe [XmlWriterSettings](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
