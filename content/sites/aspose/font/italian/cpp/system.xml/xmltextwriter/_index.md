---
title: "classe System::Xml::XmlTextWriter"
linktitle: "XmlTextWriter"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlTextWriter. Rappresenta uno scrittore che fornisce un modo veloce, non memorizzato nella cache e unidirezionale per generare flussi o file contenenti dati XML conformi alle raccomandazioni W3C Extensible Markup Language (XML) 1.0 e Namespaces in XML in C++."
type: docs
weight: 4000
url: /it/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


Rappresenta uno scrittore che fornisce un modo rapido, non memorizzato nella cache e solo in avanti per generare flussi o file contenenti dati XML conformi al W3C Extensible Markup Language (XML) 1.0 e alle raccomandazioni Namespaces in XML.

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Chiude questo flusso e il flusso sottostante. |
| [Flush](./flush/)() override | Svuota tutto ciò che è nel buffer verso i flussi sottostanti e svuota anche il flusso sottostante. |
| [get_BaseStream](./get_basestream/)() | Restituisce l'oggetto flusso sottostante. |
| [get_Formatting](./get_formatting/)() | Indica come è formattato l'output. |
| [get_Indentation](./get_indentation/)() | Restituisce quanti IndentChars scrivere per ogni livello nella gerarchia quando [XmlTextWriter::set_Formatting](./set_formatting/) è impostato su [Formatting::Indented](../formatting/). |
| [get_IndentChar](./get_indentchar/)() | Restituisce quale carattere utilizzare per l'indentazione quando [XmlTextWriter::set_Formatting](./set_formatting/) è impostato su [Formatting::Indented](../formatting/). |
| [get_Namespaces](./get_namespaces/)() | Restituisce un valore che indica se abilitare il supporto dei namespace. |
| [get_QuoteChar](./get_quotechar/)() | Restituisce quale carattere utilizzare per citare i valori degli attributi. |
| [get_WriteState](./get_writestate/)() override | Restituisce lo stato del writer. |
| [get_XmlLang](./get_xmllang/)() override | Restituisce l'ambito **xml:lang** corrente. |
| [get_XmlSpace](./get_xmlspace/)() override | Restituisce un [XmlSpace](../xmlspace/) che rappresenta l'ambito **xml:space** corrente. |
| [LookupPrefix](./lookupprefix/)(String) override | Restituisce il prefisso più vicino definito nell'ambito namespace corrente per l'URI del namespace. |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | Indica come è formattato l'output. |
| [set_Indentation](./set_indentation/)(int32_t) | Imposta quanti IndentChars scrivere per ogni livello nella gerarchia quando [XmlTextWriter::set_Formatting](./set_formatting/) è impostato su [Formatting::Indented](../formatting/). |
| [set_IndentChar](./set_indentchar/)(char16_t) | Imposta quale carattere utilizzare per l'indentazione quando [XmlTextWriter::set_Formatting](./set_formatting/) è impostato su [Formatting::Indented](../formatting/). |
| [set_Namespaces](./set_namespaces/)(bool) | Imposta un valore che indica se abilitare il supporto dei namespace. |
| [set_QuoteChar](./set_quotechar/)(char16_t) | Imposta quale carattere utilizzare per citare i valori degli attributi. |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Codifica i byte binari specificati come base64 e scrive il testo risultante. |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Codifica i byte binari specificati come binhex e scrive il testo risultante. |
| [WriteCData](./writecdata/)(String) override | Scrive un blocco **...** contenente il testo specificato. |
| [WriteCharEntity](./writecharentity/)(char16_t) override | Forza la generazione di un'entità di carattere per il valore Unicode del carattere specificato. |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Scrive il testo un buffer alla volta. |
| [WriteComment](./writecomment/)(String) override | Scrive un commento **** contenente il testo specificato. |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | Scrive la dichiarazione DOCTYPE con il nome specificato e gli attributi opzionali. |
| [WriteEndAttribute](./writeendattribute/)() override | Chiude la chiamata precedente a [XmlTextWriter::WriteStartAttribute](./writestartattribute/). |
| [WriteEndDocument](./writeenddocument/)() override | Chiude eventuali elementi o attributi aperti e riporta il writer allo stato Start. |
| [WriteEndElement](./writeendelement/)() override | Chiude un elemento e rimuove l'ambito namespace corrispondente. |
| [WriteEntityRef](./writeentityref/)(const String\&) override | Scrive un riferimento a entità come **&name**;. |
| [WriteFullEndElement](./writefullendelement/)() override | Chiude un elemento e rimuove l'ambito namespace corrispondente. |
| [WriteName](./writename/)(const String\&) override | Scrive il nome specificato, assicurandosi che sia un nome valido secondo la [W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name). |
| [WriteNmToken](./writenmtoken/)(const String\&) override | Scrive il nome specificato, assicurandosi che sia un **NmToken** valido secondo la [raccomandazione W3C XML 1.0](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name). |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | Scrive un'istruzione di elaborazione con uno spazio tra il nome e il testo come segue: **<?name text?>**. |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | Scrive il nome qualificato per lo spazio dei nomi. Questo metodo ricerca il prefisso che è in ambito per lo spazio dei nomi fornito. |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Scrive markup grezzo manualmente da un buffer di caratteri. |
| [WriteRaw](./writeraw/)(const String\&) override | Scrive markup grezzo manualmente da una stringa. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | Scrive l'inizio di un attributo. |
| [WriteStartDocument](./writestartdocument/)() override | Scrive la dichiarazione XML con la versione "1.0". |
| [WriteStartDocument](./writestartdocument/)(bool) override | Scrive la dichiarazione XML con la versione "1.0" e l'attributo standalone. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | Scrive il tag di apertura specificato e lo associa allo spazio dei nomi e al prefisso forniti. |
| [WriteString](./writestring/)(const String\&) override | Scrive il contenuto di testo fornito. |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | Genera e scrive l'entità di carattere surrogato per la coppia di caratteri surrogati. |
| [WriteWhitespace](./writewhitespace/)(String) override | Scrive lo spazio bianco fornito. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Crea un'istanza della classe [XmlTextWriter](./) utilizzando lo stream e la codifica specificati. |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | Crea un'istanza della classe [XmlTextWriter](./) utilizzando il file specificato. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | Crea un'istanza della classe [XmlTextWriter](./) utilizzando il TextWriter specificato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Si consiglia di utilizzare la classe [XmlWriter](../xmlwriter/) al suo posto.

Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
