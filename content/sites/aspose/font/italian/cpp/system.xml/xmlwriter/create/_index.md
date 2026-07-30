---
title: "Metodo System::Xml::XmlWriter::Create"
linktitle: "Create"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlWriter::Create. Crea una nuova istanza di XmlWriter utilizzando lo stream specificato in C++."
type: docs
weight: 3700
url: /it/cpp/system.xml/xmlwriter/create/
---
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&) method


Crea una nuova istanza di [XmlWriter](../) utilizzando lo stream specificato.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | Lo stream su cui vuoi scrivere. Il [XmlWriter](../) scrive la sintassi testuale XML 1.0 e la aggiunge allo stream specificato. |

### ReturnValue

Un oggetto [XmlWriter](../).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) method


Crea una nuova istanza di [XmlWriter](../) utilizzando lo stream e l'oggetto [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | Lo stream su cui vuoi scrivere. Il [XmlWriter](../) scrive la sintassi testuale XML 1.0 e la aggiunge allo stream specificato. |
| settings | SharedPtr\<XmlWriterSettings\> | L'oggetto [XmlWriterSettings](../../xmlwritersettings/) usato per configurare la nuova istanza di [XmlWriter](../). Se è **nullptr**, viene utilizzato un [XmlWriterSettings](../../xmlwritersettings/) con impostazioni predefinite. Se il [XmlWriter](../) viene usato con il metodo XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), dovresti usare il valore XslCompiledTransform::get_OutputSettings per ottenere un oggetto [XmlWriterSettings](../../xmlwritersettings/) con le impostazioni corrette. Questo garantisce che l'oggetto [XmlWriter](../) creato abbia le impostazioni di output corrette. |

### ReturnValue

Un oggetto [XmlWriter](../).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&) method


Crea una nuova istanza di [XmlWriter](../) utilizzando il TextWriter specificato.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | Il TextWriter su cui vuoi scrivere. Il [XmlWriter](../) scrive la sintassi testuale XML 1.0 e la aggiunge al TextWriter specificato. |

### ReturnValue

Un oggetto [XmlWriter](../).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Crea una nuova istanza di [XmlWriter](../) utilizzando il TextWriter e gli oggetti [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | Il TextWriter su cui vuoi scrivere. Il [XmlWriter](../) scrive la sintassi testuale XML 1.0 e la aggiunge al TextWriter specificato. |
| settings | SharedPtr\<XmlWriterSettings\> | L'oggetto [XmlWriterSettings](../../xmlwritersettings/) usato per configurare la nuova istanza di [XmlWriter](../). Se è **nullptr**, viene utilizzato un [XmlWriterSettings](../../xmlwritersettings/) con impostazioni predefinite. Se il [XmlWriter](../) viene usato con il metodo XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), dovresti usare il valore XslCompiledTransform::get_OutputSettings per ottenere un oggetto [XmlWriterSettings](../../xmlwritersettings/) con le impostazioni corrette. Questo garantisce che l'oggetto [XmlWriter](../) creato abbia le impostazioni di output corrette. |

### ReturnValue

Un oggetto [XmlWriter](../).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&) method


Crea una nuova istanza di [XmlWriter](../) utilizzando il [Text::StringBuilder](../../../system.text/stringbuilder/) specificato.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | Il [Text::StringBuilder](../../../system.text/stringbuilder/) su cui scrivere. Il contenuto scritto dal [XmlWriter](../) viene aggiunto al [Text::StringBuilder](../../../system.text/stringbuilder/). |

### ReturnValue

Un oggetto [XmlWriter](../).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) method


Crea una nuova istanza di [XmlWriter](../) utilizzando il [Text::StringBuilder](../../../system.text/stringbuilder/) e gli oggetti [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | Il [Text::StringBuilder](../../../system.text/stringbuilder/) su cui scrivere. Il contenuto scritto dal [XmlWriter](../) viene aggiunto al [Text::StringBuilder](../../../system.text/stringbuilder/). |
| settings | SharedPtr\<XmlWriterSettings\> | L'oggetto [XmlWriterSettings](../../xmlwritersettings/) usato per configurare la nuova istanza di [XmlWriter](../). Se è **nullptr**, viene utilizzato un [XmlWriterSettings](../../xmlwritersettings/) con impostazioni predefinite. Se il [XmlWriter](../) viene usato con il metodo XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), dovresti usare il valore XslCompiledTransform::get_OutputSettings per ottenere un oggetto [XmlWriterSettings](../../xmlwritersettings/) con le impostazioni corrette. Questo garantisce che l'oggetto [XmlWriter](../) creato abbia le impostazioni di output corrette. |

### ReturnValue

Un oggetto [XmlWriter](../).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&) method


Crea una nuova istanza di [XmlWriter](../) utilizzando l'oggetto [XmlWriter](../) specificato.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | L'oggetto [XmlWriter](../) che desideri utilizzare come scrittore sottostante. |

### ReturnValue

Un oggetto [XmlWriter](../) che avvolge l'oggetto [XmlWriter](../) specificato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Crea una nuova istanza di [XmlWriter](../) utilizzando gli oggetti [XmlWriter](../) e [XmlWriterSettings](../../xmlwritersettings/) specificati.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | L'oggetto [XmlWriter](../) che desideri utilizzare come scrittore sottostante. |
| settings | SharedPtr\<XmlWriterSettings\> | L'oggetto [XmlWriterSettings](../../xmlwritersettings/) usato per configurare la nuova istanza di [XmlWriter](../). Se è **nullptr**, viene utilizzato un [XmlWriterSettings](../../xmlwritersettings/) con impostazioni predefinite. Se il [XmlWriter](../) viene usato con il metodo XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), dovresti usare il valore XslCompiledTransform::get_OutputSettings per ottenere un oggetto [XmlWriterSettings](../../xmlwritersettings/) con le impostazioni corrette. Questo garantisce che l'oggetto [XmlWriter](../) creato abbia le impostazioni di output corrette. |

### ReturnValue

Un oggetto [XmlWriter](../) che avvolge l'oggetto [XmlWriter](../) specificato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const String\&) method


Crea una nuova istanza di [XmlWriter](../) utilizzando il nome file specificato.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outputFileName | const String\& | Il file su cui vuoi scrivere. Il [XmlWriter](../) crea un file nel percorso specificato e vi scrive in sintassi testuale XML 1.0. Il **outputFileName** deve essere un percorso del file system. |

### ReturnValue

Un oggetto [XmlWriter](../).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const String\&, SharedPtr\<XmlWriterSettings\>) method


Crea una nuova istanza di [XmlWriter](../) utilizzando il nome file e l'oggetto [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName, SharedPtr<XmlWriterSettings> settings)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outputFileName | const String\& | Il file su cui vuoi scrivere. Il [XmlWriter](../) crea un file nel percorso specificato e vi scrive in sintassi testuale XML 1.0. Il **outputFileName** deve essere un percorso del file system. |
| settings | SharedPtr\<XmlWriterSettings\> | L'oggetto [XmlWriterSettings](../../xmlwritersettings/) usato per configurare la nuova istanza di [XmlWriter](../). Se è **nullptr**, viene utilizzato un [XmlWriterSettings](../../xmlwritersettings/) con impostazioni predefinite. Se il [XmlWriter](../) viene usato con il metodo XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), dovresti usare il valore XslCompiledTransform::get_OutputSettings per ottenere un oggetto [XmlWriterSettings](../../xmlwritersettings/) con le impostazioni corrette. Questo garantisce che l'oggetto [XmlWriter](../) creato abbia le impostazioni di output corrette. |

### ReturnValue

Un oggetto [XmlWriter](../).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
