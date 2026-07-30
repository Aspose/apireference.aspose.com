---
title: "System::Xml::XmlWriter::Create-Methode"
linktitle: "Create"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlWriter::Create-Methode. Erstellt eine neue XmlWriter-Instanz unter Verwendung des angegebenen Streams in C++."
type: docs
weight: 3700
url: /de/cpp/system.xml/xmlwriter/create/
---
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&) method


Erstellt eine neue [XmlWriter](../)-Instanz unter Verwendung des angegebenen Streams.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | Der Stream, in den Sie schreiben möchten. Der [XmlWriter](../) schreibt XML‑1.0‑Textsyntax und fügt sie dem angegebenen Stream hinzu. |

### ReturnValue

Ein [XmlWriter](../)-Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) method


Erstellt eine neue [XmlWriter](../)-Instanz unter Verwendung des Streams und des [XmlWriterSettings](../../xmlwritersettings/)-Objekts.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | Der Stream, in den Sie schreiben möchten. Der [XmlWriter](../) schreibt XML‑1.0‑Textsyntax und fügt sie dem angegebenen Stream hinzu. |
| settings | SharedPtr\<XmlWriterSettings\> | Das [XmlWriterSettings](../../xmlwritersettings/)-Objekt, das zum Konfigurieren der neuen [XmlWriter](../)-Instanz verwendet wird. Wenn dies **nullptr** ist, wird ein [XmlWriterSettings](../../xmlwritersettings/)-Objekt mit Standardeinstellungen verwendet. Wenn der [XmlWriter](../) mit der Methode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) verwendet wird, sollten Sie den Wert XslCompiledTransform::get_OutputSettings nutzen, um ein [XmlWriterSettings](../../xmlwritersettings/)-Objekt mit den korrekten Einstellungen zu erhalten. Dies stellt sicher, dass das erstellte [XmlWriter](../)-Objekt die richtigen Ausgabeeinstellungen hat. |

### ReturnValue

Ein [XmlWriter](../)-Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&) method


Erstellt eine neue [XmlWriter](../)-Instanz unter Verwendung des angegebenen TextWriter.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | Der TextWriter, in den Sie schreiben möchten. Der [XmlWriter](../) schreibt XML‑1.0‑Textsyntax und fügt sie dem angegebenen TextWriter hinzu. |

### ReturnValue

Ein [XmlWriter](../)-Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Erstellt eine neue [XmlWriter](../)-Instanz unter Verwendung des TextWriter und der [XmlWriterSettings](../../xmlwritersettings/)-Objekte.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | Der TextWriter, in den Sie schreiben möchten. Der [XmlWriter](../) schreibt XML‑1.0‑Textsyntax und fügt sie dem angegebenen TextWriter hinzu. |
| settings | SharedPtr\<XmlWriterSettings\> | Das [XmlWriterSettings](../../xmlwritersettings/)-Objekt, das zum Konfigurieren der neuen [XmlWriter](../)-Instanz verwendet wird. Wenn dies **nullptr** ist, wird ein [XmlWriterSettings](../../xmlwritersettings/)-Objekt mit Standardeinstellungen verwendet. Wenn der [XmlWriter](../) mit der Methode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) verwendet wird, sollten Sie den Wert XslCompiledTransform::get_OutputSettings nutzen, um ein [XmlWriterSettings](../../xmlwritersettings/)-Objekt mit den korrekten Einstellungen zu erhalten. Dies stellt sicher, dass das erstellte [XmlWriter](../)-Objekt die richtigen Ausgabeeinstellungen hat. |

### ReturnValue

Ein [XmlWriter](../)-Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&) method


Erstellt eine neue [XmlWriter](../)-Instanz unter Verwendung des angegebenen [Text::StringBuilder](../../../system.text/stringbuilder/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | Der [Text::StringBuilder](../../../system.text/stringbuilder/), in den geschrieben werden soll. Der vom [XmlWriter](../) geschriebene Inhalt wird an den [Text::StringBuilder](../../../system.text/stringbuilder/) angehängt. |

### ReturnValue

Ein [XmlWriter](../)-Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) method


Erstellt eine neue [XmlWriter](../)-Instanz unter Verwendung des [Text::StringBuilder](../../../system.text/stringbuilder/) und der [XmlWriterSettings](../../xmlwritersettings/)-Objekte.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | Der [Text::StringBuilder](../../../system.text/stringbuilder/), in den geschrieben werden soll. Der vom [XmlWriter](../) geschriebene Inhalt wird an den [Text::StringBuilder](../../../system.text/stringbuilder/) angehängt. |
| settings | SharedPtr\<XmlWriterSettings\> | Das [XmlWriterSettings](../../xmlwritersettings/)-Objekt, das zum Konfigurieren der neuen [XmlWriter](../)-Instanz verwendet wird. Wenn dies **nullptr** ist, wird ein [XmlWriterSettings](../../xmlwritersettings/)-Objekt mit Standardeinstellungen verwendet. Wenn der [XmlWriter](../) mit der Methode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) verwendet wird, sollten Sie den Wert XslCompiledTransform::get_OutputSettings nutzen, um ein [XmlWriterSettings](../../xmlwritersettings/)-Objekt mit den korrekten Einstellungen zu erhalten. Dies stellt sicher, dass das erstellte [XmlWriter](../)-Objekt die richtigen Ausgabeeinstellungen hat. |

### ReturnValue

Ein [XmlWriter](../)-Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&) method


Erstellt eine neue [XmlWriter](../)-Instanz unter Verwendung des angegebenen [XmlWriter](../)-Objekts.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | Das [XmlWriter](../)-Objekt, das Sie als zugrunde liegenden Writer verwenden möchten. |

### ReturnValue

Ein [XmlWriter](../)-Objekt, das um das angegebene [XmlWriter](../)-Objekt gewickelt ist.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Erstellt eine neue [XmlWriter](../)-Instanz unter Verwendung der angegebenen [XmlWriter](../)- und [XmlWriterSettings](../../xmlwritersettings/)-Objekte.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | Das [XmlWriter](../)-Objekt, das Sie als zugrunde liegenden Writer verwenden möchten. |
| settings | SharedPtr\<XmlWriterSettings\> | Das [XmlWriterSettings](../../xmlwritersettings/)-Objekt, das zum Konfigurieren der neuen [XmlWriter](../)-Instanz verwendet wird. Wenn dies **nullptr** ist, wird ein [XmlWriterSettings](../../xmlwritersettings/)-Objekt mit Standardeinstellungen verwendet. Wenn der [XmlWriter](../) mit der Methode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) verwendet wird, sollten Sie den Wert XslCompiledTransform::get_OutputSettings nutzen, um ein [XmlWriterSettings](../../xmlwritersettings/)-Objekt mit den korrekten Einstellungen zu erhalten. Dies stellt sicher, dass das erstellte [XmlWriter](../)-Objekt die richtigen Ausgabeeinstellungen hat. |

### ReturnValue

Ein [XmlWriter](../)-Objekt, das um das angegebene [XmlWriter](../)-Objekt gewickelt ist.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const String\&) method


Erstellt eine neue [XmlWriter](../)-Instanz unter Verwendung des angegebenen Dateinamens.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outputFileName | const String\& | Die Datei, in die Sie schreiben möchten. Der [XmlWriter](../) erstellt eine Datei am angegebenen Pfad und schreibt in XML‑1.0‑Textsyntax hinein. Der **outputFileName** muss ein Dateisystempfad sein. |

### ReturnValue

Ein [XmlWriter](../)-Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const String\&, SharedPtr\<XmlWriterSettings\>) method


Erstellt eine neue [XmlWriter](../)-Instanz unter Verwendung des Dateinamens und des [XmlWriterSettings](../../xmlwritersettings/)-Objekts.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outputFileName | const String\& | Die Datei, in die Sie schreiben möchten. Der [XmlWriter](../) erstellt eine Datei am angegebenen Pfad und schreibt in XML‑1.0‑Textsyntax hinein. Der **outputFileName** muss ein Dateisystempfad sein. |
| settings | SharedPtr\<XmlWriterSettings\> | Das [XmlWriterSettings](../../xmlwritersettings/)-Objekt, das zum Konfigurieren der neuen [XmlWriter](../)-Instanz verwendet wird. Wenn dies **nullptr** ist, wird ein [XmlWriterSettings](../../xmlwritersettings/)-Objekt mit Standardeinstellungen verwendet. Wenn der [XmlWriter](../) mit der Methode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) verwendet wird, sollten Sie den Wert XslCompiledTransform::get_OutputSettings nutzen, um ein [XmlWriterSettings](../../xmlwritersettings/)-Objekt mit den korrekten Einstellungen zu erhalten. Dies stellt sicher, dass das erstellte [XmlWriter](../)-Objekt die richtigen Ausgabeeinstellungen hat. |

### ReturnValue

Ein [XmlWriter](../)-Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
