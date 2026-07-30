---
title: "Classe System::Xml::XmlWriter"
linktitle: "XmlWriter"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlWriter. Rappresenta uno scrittore che fornisce un modo veloce, non memorizzato nella cache e unidirezionale per generare flussi o file contenenti dati XML in C++."
type: docs
weight: 4400
url: /it/cpp/system.xml/xmlwriter/
---
## XmlWriter class


Rappresenta un writer che fornisce un modo veloce, non memorizzato nella cache e solo in avanti per generare stream o file che contengono dati XML.

```cpp
class XmlWriter : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Close](./close/)() | Quando sovrascritto in una classe derivata, chiude questo flusso e il flusso sottostante. |
| static [Create](./create/)(const String\&) | Crea una nuova istanza di [XmlWriter](./) utilizzando il nome file specificato. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | Crea una nuova istanza di [XmlWriter](./) utilizzando il nome file e l'oggetto [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Crea una nuova istanza di [XmlWriter](./) utilizzando il flusso specificato. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | Crea una nuova istanza di [XmlWriter](./) utilizzando il flusso e l'oggetto [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | Crea una nuova istanza di [XmlWriter](./) utilizzando il TextWriter specificato. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Crea una nuova istanza di [XmlWriter](./) utilizzando il TextWriter e gli oggetti [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | Crea una nuova istanza di [XmlWriter](./) utilizzando il [Text::StringBuilder](../../system.text/stringbuilder/) specificato. |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | Crea una nuova istanza di [XmlWriter](./) utilizzando il [Text::StringBuilder](../../system.text/stringbuilder/) e gli oggetti [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | Crea una nuova istanza di [XmlWriter](./) utilizzando l'oggetto [XmlWriter](./) specificato. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Crea una nuova istanza di [XmlWriter](./) utilizzando gli oggetti [XmlWriter](./) e [XmlWriterSettings](../xmlwritersettings/) specificati. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate dall'istanza corrente della classe [XmlWriter](./). |
| virtual [Flush](./flush/)() | Quando sovrascritto in una classe derivata, svuota tutto ciò che è nel buffer verso i flussi sottostanti e svuota anche il flusso sottostante. |
| virtual [get_Settings](./get_settings/)() | Restituisce l'oggetto [XmlWriterSettings](../xmlwritersettings/) utilizzato per creare questa istanza di [XmlWriter](./). |
| virtual [get_WriteState](./get_writestate/)() | Quando sovrascritto in una classe derivata, ottiene lo stato dello scrittore. |
| virtual [get_XmlLang](./get_xmllang/)() | Quando sovrascritto in una classe derivata, ottiene l'ambito **xml:lang** corrente. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Quando sovrascritto in una classe derivata, ottiene un [XmlSpace](../xmlspace/) che rappresenta l'ambito corrente **xml:space**. |
| virtual [LookupPrefix](./lookupprefix/)(String) | Quando sovrascritto in una classe derivata, restituisce il prefisso più vicino definito nell'ambito corrente dello spazio dei nomi per l'URI dello spazio dei nomi. |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | Quando sovrascritto in una classe derivata, scrive tutti gli attributi trovati nella posizione corrente del [XmlReader](../xmlreader/). |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | Quando sovrascritto in una classe derivata, scrive un attributo con il nome locale specificato, l'URI dello spazio dei nomi e il valore. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | Quando sovrascritto in una classe derivata, scrive l'attributo con il nome locale e il valore specificati. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | Quando sovrascritto in una classe derivata, scrive l'attributo con il prefisso, il nome locale, l'URI dello spazio dei nomi e il valore specificati. |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Quando sovrascritto in una classe derivata, codifica i byte binari specificati come Base64 e scrive il testo risultante. |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Quando sovrascritto in una classe derivata, codifica i byte binari specificati come **BinHex** e scrive il testo risultante. |
| virtual [WriteCData](./writecdata/)(String) | Quando sovrascritto in una classe derivata, scrive un blocco **...** contenente il testo specificato. |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | Quando sovrascritto in una classe derivata, forza la generazione di un'entità di carattere per il valore Unicode del carattere specificato. |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Quando sovrascritto in una classe derivata, scrive il testo un buffer alla volta. |
| virtual [WriteComment](./writecomment/)(String) | Quando sovrascritto in una classe derivata, scrive un commento **** contenente il testo specificato. |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | Quando sovrascritto in una classe derivata, scrive la dichiarazione DOCTYPE con il nome specificato e gli attributi opzionali. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | Scrive un elemento con il nome locale e il valore specificati. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | Scrive un elemento con il nome locale, l'URI dello spazio dei nomi e il valore specificati. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | Scrive un elemento con il prefisso, il nome locale, l'URI dello spazio dei nomi e il valore specificati. |
| virtual [WriteEndAttribute](./writeendattribute/)() | Quando sovrascritto in una classe derivata, chiude la chiamata precedente XmlWriter::WriteStartAttribute(String,String). |
| virtual [WriteEndDocument](./writeenddocument/)() | Quando sovrascritto in una classe derivata, chiude tutti gli elementi o gli attributi aperti e riporta lo scrittore allo stato Start. |
| virtual [WriteEndElement](./writeendelement/)() | Quando sovrascritto in una classe derivata, chiude un elemento e rimuove l'ambito dello spazio dei nomi corrispondente. |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | Quando sovrascritto in una classe derivata, scrive un riferimento di entità come **&name**;. |
| virtual [WriteFullEndElement](./writefullendelement/)() | Quando sovrascritto in una classe derivata, chiude un elemento e rimuove l'ambito dello spazio dei nomi corrispondente. |
| virtual [WriteName](./writename/)(const String\&) | Quando sovrascritto in una classe derivata, scrive il nome specificato, assicurandosi che sia un nome valido secondo la raccomandazione W3C XML 1.0 ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | Quando sovrascritto in una classe derivata, scrive il nome specificato, assicurandosi che sia un NmToken valido secondo la raccomandazione W3C XML 1.0 ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | Quando sovrascritto in una classe derivata, copia tutto dal lettore allo scrittore e sposta il lettore all'inizio del fratello successivo. |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | Copia tutto dall'oggetto XPathNavigator allo scrittore. La posizione dell'XPathNavigator rimane invariata. |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | Quando sovrascritto in una classe derivata, scrive un'istruzione di elaborazione con uno spazio tra il nome e il testo come segue: **<?name text?>**. |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | Quando sovrascritto in una classe derivata, scrive il nome qualificato per lo spazio dei nomi. Questo metodo cerca il prefisso che è in ambito per lo spazio dei nomi fornito. |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Quando sovrascritto in una classe derivata, scrive markup grezzo manualmente da un buffer di caratteri. |
| virtual [WriteRaw](./writeraw/)(const String\&) | Quando sovrascritto in una classe derivata, scrive markup grezzo manualmente da una stringa. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | Scrive l'inizio di un attributo con il nome locale specificato e l'URI dello spazio dei nomi. |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | Quando sovrascritto in una classe derivata, scrive l'inizio di un attributo con il prefisso specificato, il nome locale e l'URI dello spazio dei nomi. |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | Scrive l'inizio di un attributo con il nome locale specificato. |
| virtual [WriteStartDocument](./writestartdocument/)() | Quando sovrascritto in una classe derivata, scrive la dichiarazione XML con la versione "1.0". |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | Quando sovrascritto in una classe derivata, scrive la dichiarazione XML con la versione "1.0" e l'attributo standalone. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | Quando sovrascritto in una classe derivata, scrive il tag di apertura specificato e lo associa allo spazio dei nomi fornito. |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | Quando sovrascritto in una classe derivata, scrive il tag di apertura specificato e lo associa allo spazio dei nomi e al prefisso forniti. |
| [WriteStartElement](./writestartelement/)(const String\&) | Quando sovrascritto in una classe derivata, scrive un tag di apertura con il nome locale specificato. |
| virtual [WriteString](./writestring/)(const String\&) | Quando sovrascritto in una classe derivata, scrive il contenuto di testo fornito. |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | Quando sovrascritto in una classe derivata, genera e scrive l'entità di carattere surrogato per la coppia di caratteri surrogati. |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | Scrive il valore dell'oggetto. |
| virtual [WriteValue](./writevalue/)(const String\&) | Scrive un valore [String](../../system/string/). |
| virtual [WriteValue](./writevalue/)(bool) | Scrive un valore [Boolean](../../system/boolean/). |
| virtual [WriteValue](./writevalue/)(DateTime) | Scrive un valore [DateTime](../../system/datetime/). |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | Scrive un valore [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [WriteValue](./writevalue/)(double) | Scrive un valore [Double](../../system/double/). |
| virtual [WriteValue](./writevalue/)(float) | Scrive un numero a virgola mobile a precisione singola. |
| virtual [WriteValue](./writevalue/)(Decimal) | Scrive un valore [Decimal](../../system/decimal/). |
| virtual [WriteValue](./writevalue/)(int32_t) | Scrive un valore [Int32](../../system/int32/). |
| virtual [WriteValue](./writevalue/)(int64_t) | Scrive un valore [Int64](../../system/int64/). |
| virtual [WriteWhitespace](./writewhitespace/)(String) | Quando sovrascritto in una classe derivata, scrive lo spazio bianco fornito. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
