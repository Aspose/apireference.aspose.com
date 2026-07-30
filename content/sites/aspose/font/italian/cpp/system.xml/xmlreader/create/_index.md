---
title: "System::Xml::XmlReader::Create metodo"
linktitle: "Create"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReader::Create metodo. Crea una nuova istanza di XmlReader utilizzando lo stream specificato con le impostazioni predefinite in C++."
type: docs
weight: 7700
url: /it/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


Crea una nuova istanza di [XmlReader](../) utilizzando lo stream specificato con le impostazioni predefinite.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Lo stream che contiene i dati XML. Il [XmlReader](../) analizza i primi byte dello stream alla ricerca di un byte order mark o di altri segni di codifica. Quando la codifica è determinata, essa viene usata per continuare a leggere lo stream, e l'elaborazione prosegue analizzando l'input come un flusso di caratteri (Unicode). |

### ReturnValue

Un oggetto utilizzato per leggere i dati XML nello stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Crea una nuova istanza di [XmlReader](../) con lo stream e le impostazioni specificati.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Lo stream che contiene i dati XML. Il [XmlReader](../) analizza i primi byte dello stream alla ricerca di un byte order mark o di altri segni di codifica. Quando la codifica è determinata, essa viene usata per continuare a leggere lo stream, e l'elaborazione prosegue analizzando l'input come un flusso di caratteri (Unicode). |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Le impostazioni per la nuova istanza di [XmlReader](../). Questo valore può essere **nullptr**. |

### ReturnValue

Un oggetto utilizzato per leggere i dati XML nello stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Crea una nuova istanza di [XmlReader](../) utilizzando lo stream specificato, le impostazioni e le informazioni di contesto per l'analisi.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Lo stream che contiene i dati XML. Il [XmlReader](../) analizza i primi byte dello stream alla ricerca di un byte order mark o di altri segni di codifica. Quando la codifica è determinata, essa viene usata per continuare a leggere lo stream, e l'elaborazione prosegue analizzando l'input come un flusso di caratteri (Unicode). |
| settings | SharedPtr\<XmlReaderSettings\> | Le impostazioni per la nuova istanza di [XmlReader](../). Questo valore può essere **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Le informazioni di contesto necessarie per analizzare il frammento XML. Le informazioni di contesto possono includere il [XmlNameTable](../../xmlnametable/) da utilizzare, la codifica, l'ambito dei namespace, l'attuale ambito **xml:lang** e **xml:space**, l'URI di base e la definizione del tipo di documento. Questo valore può essere **nullptr**. |

### ReturnValue

Un oggetto utilizzato per leggere i dati XML nello stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Crea una nuova istanza di [XmlReader](../) utilizzando lo stream specificato, l'URI di base e le impostazioni.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Lo stream che contiene i dati XML. Il [XmlReader](../) analizza i primi byte dello stream alla ricerca di un byte order mark o di altri segni di codifica. Quando la codifica è determinata, essa viene usata per continuare a leggere lo stream, e l'elaborazione prosegue analizzando l'input come un flusso di caratteri (Unicode). |
| settings | SharedPtr\<XmlReaderSettings\> | Le impostazioni per la nuova istanza di [XmlReader](../). Questo valore può essere **nullptr**. |
| baseUri | const String\& | L'URI di base per l'entità o il documento in lettura. Questo valore può essere **nullptr**. **[Security](../../../system.security/) Nota** L'URI di base è utilizzato per risolvere l'URI relativo del documento XML. Non utilizzare un URI di base da una fonte non attendibile. |

### ReturnValue

Un oggetto utilizzato per leggere i dati XML nello stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


Crea una nuova istanza di [XmlReader](../) utilizzando il lettore di testo specificato.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Il lettore di testo da cui leggere i dati XML. Un lettore di testo restituisce un flusso di caratteri Unicode, quindi la codifica specificata nella dichiarazione XML non è utilizzata dal lettore XML per decodificare il flusso di dati. |

### ReturnValue

Un oggetto utilizzato per leggere i dati XML nello stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Crea una nuova istanza di [XmlReader](../) utilizzando il lettore di testo e le impostazioni specificati.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Il lettore di testo da cui leggere i dati XML. Un lettore di testo restituisce un flusso di caratteri Unicode, quindi la codifica specificata nella dichiarazione XML non è utilizzata dal lettore XML per decodificare il flusso di dati. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Le impostazioni per il nuovo [XmlReader](../). Questo valore può essere **nullptr**. |

### ReturnValue

Un oggetto utilizzato per leggere i dati XML nello stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Crea una nuova istanza di [XmlReader](../) utilizzando il lettore di testo, le impostazioni e le informazioni di contesto specificate per l'analisi.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Il lettore di testo da cui leggere i dati XML. Un lettore di testo restituisce un flusso di caratteri Unicode, quindi la codifica specificata nella dichiarazione XML non è utilizzata dal lettore XML per decodificare il flusso di dati. |
| settings | SharedPtr\<XmlReaderSettings\> | Le impostazioni per la nuova istanza di [XmlReader](../). Questo valore può essere **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Le informazioni di contesto necessarie per analizzare il frammento XML. Le informazioni di contesto possono includere il [XmlNameTable](../../xmlnametable/) da utilizzare, la codifica, l'ambito dei namespace, l'attuale ambito **xml:lang** e **xml:space**, l'URI di base e la definizione del tipo di documento. Questo valore può essere **nullptr**. |

### ReturnValue

Un oggetto utilizzato per leggere i dati XML nello stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Crea una nuova istanza di [XmlReader](../) utilizzando il lettore di testo, le impostazioni e l'URI di base specificati.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Il lettore di testo da cui leggere i dati XML. Un lettore di testo restituisce un flusso di caratteri Unicode, quindi la codifica specificata nella dichiarazione XML non è utilizzata dal [XmlReader](../) per decodificare il flusso di dati. |
| settings | SharedPtr\<XmlReaderSettings\> | Le impostazioni per la nuova istanza di [XmlReader](../). Questo valore può essere **nullptr**. |
| baseUri | const String\& | L'URI di base per l'entità o il documento in lettura. Questo valore può essere **nullptr**. **[Security](../../../system.security/) Nota** L'URI di base è utilizzato per risolvere l'URI relativo del documento XML. Non utilizzare un URI di base da una fonte non attendibile. |

### ReturnValue

Un oggetto utilizzato per leggere i dati XML nello stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


Crea una nuova istanza di [XmlReader](../) utilizzando il lettore XML e le impostazioni specificati.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| lettore | const SharedPtr\<XmlReader\>\& | L'oggetto che si desidera utilizzare come lettore XML sottostante. |
| settings | SharedPtr\<XmlReaderSettings\> | Le impostazioni per la nuova istanza di [XmlReader](../). Il livello di conformità dell'oggetto [XmlReaderSettings](../../xmlreadersettings/) deve corrispondere al livello di conformità del lettore sottostante, oppure deve essere impostato su [ConformanceLevel::Auto](../../conformancelevel/). |

### ReturnValue

Un oggetto che avvolge l'oggetto [XmlReader](../) specificato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&) method


Crea una nuova istanza di [XmlReader](../) con l'URI specificato.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputUri | const String\& | L'URI del file che contiene i dati XML. La classe [XmlUrlResolver](../../xmlurlresolver/) è utilizzata per convertire il percorso in una rappresentazione dati canonica. |

### ReturnValue

Un oggetto utilizzato per leggere i dati XML nello stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


Crea una nuova istanza di [XmlReader](../) utilizzando l'URI e le impostazioni specificati.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputUri | const String\& | L'URI del file contenente i dati XML. L'oggetto [XmlResolver](../../xmlresolver/) sull'oggetto [XmlReaderSettings](../../xmlreadersettings/) è utilizzato per convertire il percorso in una rappresentazione dati canonica. Se il valore XmlReaderSettings::get_XmlResolver è **nullptr**, viene utilizzato un nuovo oggetto [XmlUrlResolver](../../xmlurlresolver/). |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Le impostazioni per la nuova istanza di [XmlReader](../). Questo valore può essere **nullptr**. |

### ReturnValue

Un oggetto utilizzato per leggere i dati XML nello stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Crea una nuova istanza di [XmlReader](../) utilizzando l'URI, le impostazioni e le informazioni di contesto specificati per l'analisi.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputUri | const String\& | L'URI del file contenente i dati XML. L'oggetto [XmlResolver](../../xmlresolver/) sull'oggetto [XmlReaderSettings](../../xmlreadersettings/) è utilizzato per convertire il percorso in una rappresentazione dati canonica. Se il valore XmlReaderSettings::get_XmlResolver è **nullptr**, viene utilizzato un nuovo oggetto [XmlUrlResolver](../../xmlurlresolver/). |
| settings | SharedPtr\<XmlReaderSettings\> | Le impostazioni per la nuova istanza di [XmlReader](../). Questo valore può essere **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Le informazioni di contesto necessarie per analizzare il frammento XML. Le informazioni di contesto possono includere il [XmlNameTable](../../xmlnametable/) da utilizzare, la codifica, l'ambito dei namespace, l'attuale ambito **xml:lang** e **xml:space**, l'URI di base e la definizione del tipo di documento. Questo valore può essere **nullptr**. |

### ReturnValue

Un oggetto utilizzato per leggere i dati XML nello stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
