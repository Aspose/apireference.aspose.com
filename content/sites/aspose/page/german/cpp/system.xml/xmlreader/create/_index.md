---
title: "System::Xml::XmlReader::Create-Methode"
linktitle: "Erstellen"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlReader::Create-Methode. Erstellt eine neue XmlReader-Instanz unter Verwendung des angegebenen Streams mit den Standardeinstellungen in C++."
type: docs
weight: 7700
url: /de/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz unter Verwendung des angegebenen Streams mit den Standardeinstellungen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Der Stream, der die XML-Daten enthält. Der [XmlReader](../) scannt die ersten Bytes des Streams, um nach einer Byte Order Mark oder anderen Hinweisen auf die Kodierung zu suchen. Sobald die Kodierung ermittelt ist, wird sie verwendet, um das Lesen des Streams fortzusetzen, und die Verarbeitung fährt fort, die Eingabe als einen Strom von (Unicode‑)Zeichen zu parsen. |

### ReturnValue

Ein Objekt, das verwendet wird, um die XML-Daten im Stream zu lesen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz mit dem angegebenen Stream und den Einstellungen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Der Stream, der die XML-Daten enthält. Der [XmlReader](../) scannt die ersten Bytes des Streams, um nach einer Byte Order Mark oder anderen Hinweisen auf die Kodierung zu suchen. Sobald die Kodierung ermittelt ist, wird sie verwendet, um das Lesen des Streams fortzusetzen, und die Verarbeitung fährt fort, die Eingabe als einen Strom von (Unicode‑)Zeichen zu parsen. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |

### ReturnValue

Ein Objekt, das verwendet wird, um die XML-Daten im Stream zu lesen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz unter Verwendung des angegebenen Streams, der Einstellungen und Kontextinformationen zum Parsen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Der Stream, der die XML-Daten enthält. Der [XmlReader](../) scannt die ersten Bytes des Streams, um nach einer Byte Order Mark oder anderen Hinweisen auf die Kodierung zu suchen. Sobald die Kodierung ermittelt ist, wird sie verwendet, um das Lesen des Streams fortzusetzen, und die Verarbeitung fährt fort, die Eingabe als einen Strom von (Unicode‑)Zeichen zu parsen. |
| settings | SharedPtr\<XmlReaderSettings\> | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Die Kontextinformationen, die zum Parsen des XML‑Fragments erforderlich sind. Die Kontextinformationen können die zu verwendende [XmlNameTable](../../xmlnametable/), die Kodierung, den Namensraum‑Geltungsbereich, den aktuellen **xml:lang**‑ und **xml:space**‑Geltungsbereich, die Basis‑URI und die Dokumenttypdefinition umfassen. Dieser Wert kann **nullptr** sein. |

### ReturnValue

Ein Objekt, das verwendet wird, um die XML-Daten im Stream zu lesen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Erstellt eine neue [XmlReader](../)-Instanz unter Verwendung des angegebenen Streams, der Basis‑URI und der Einstellungen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Der Stream, der die XML-Daten enthält. Der [XmlReader](../) scannt die ersten Bytes des Streams, um nach einer Byte Order Mark oder anderen Hinweisen auf die Kodierung zu suchen. Sobald die Kodierung ermittelt ist, wird sie verwendet, um das Lesen des Streams fortzusetzen, und die Verarbeitung fährt fort, die Eingabe als einen Strom von (Unicode‑)Zeichen zu parsen. |
| settings | SharedPtr\<XmlReaderSettings\> | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |
| baseUri | const String\& | Die Basis‑URI für die zu lesende Entität oder das Dokument. Dieser Wert kann **nullptr** sein. **[Security](../../../system.security/) Hinweis** Die Basis‑URI wird verwendet, um die relative URI des XML‑Dokuments aufzulösen. Verwenden Sie keine Basis‑URI aus einer nicht vertrauenswürdigen Quelle. |

### ReturnValue

Ein Objekt, das verwendet wird, um die XML-Daten im Stream zu lesen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe des angegebenen Textreaders.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<IO::TextReader\>\& | Der Textreader, aus dem die XML-Daten gelesen werden. Ein Textreader liefert einen Strom von Unicode‑Zeichen, sodass die im XML‑Deklaration angegebene Kodierung nicht vom XML‑Reader zum Dekodieren des Datenstroms verwendet wird. |

### ReturnValue

Ein Objekt, das verwendet wird, um die XML-Daten im Stream zu lesen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe des angegebenen Textreaders und der Einstellungen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<IO::TextReader\>\& | Der Textreader, aus dem die XML-Daten gelesen werden. Ein Textreader liefert einen Strom von Unicode‑Zeichen, sodass die im XML‑Deklaration angegebene Kodierung vom XML‑Reader nicht zum Dekodieren des Datenstroms verwendet wird. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Die Einstellungen für den neuen [XmlReader](../). Dieser Wert kann **nullptr** sein. |

### ReturnValue

Ein Objekt, das verwendet wird, um die XML-Daten im Stream zu lesen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe des angegebenen Textreaders, der Einstellungen und Kontextinformationen zum Parsen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<IO::TextReader\>\& | Der Textreader, aus dem die XML-Daten gelesen werden. Ein Textreader liefert einen Strom von Unicode‑Zeichen, sodass die im XML‑Deklaration angegebene Kodierung vom XML‑Reader nicht zum Dekodieren des Datenstroms verwendet wird. |
| settings | SharedPtr\<XmlReaderSettings\> | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Die Kontextinformationen, die zum Parsen des XML‑Fragments erforderlich sind. Die Kontextinformationen können die zu verwendende [XmlNameTable](../../xmlnametable/), die Kodierung, den Namensraum‑Geltungsbereich, den aktuellen **xml:lang**‑ und **xml:space**‑Geltungsbereich, die Basis‑URI und die Dokumenttypdefinition umfassen. Dieser Wert kann **nullptr** sein. |

### ReturnValue

Ein Objekt, das verwendet wird, um die XML-Daten im Stream zu lesen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe des angegebenen Textreaders, der Einstellungen und der Basis‑URI.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Der Textreader, aus dem die XML-Daten gelesen werden. Ein Textreader liefert einen Strom von Unicode‑Zeichen, sodass die im XML‑Deklaration angegebene Kodierung nicht vom [XmlReader](../) zum Dekodieren des Datenstroms verwendet wird. |
| settings | SharedPtr\<XmlReaderSettings\> | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |
| baseUri | const String\& | Die Basis‑URI für die zu lesende Entität oder das Dokument. Dieser Wert kann **nullptr** sein. **[Security](../../../system.security/) Hinweis** Die Basis‑URI wird verwendet, um die relative URI des XML‑Dokuments aufzulösen. Verwenden Sie keine Basis‑URI aus einer nicht vertrauenswürdigen Quelle. |

### ReturnValue

Ein Objekt, das verwendet wird, um die XML-Daten im Stream zu lesen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe des angegebenen XML‑Readers und der Einstellungen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Leser | const SharedPtr\<XmlReader\>\& | Das Objekt, das Sie als zugrunde liegenden XML‑Reader verwenden möchten. |
| settings | SharedPtr\<XmlReaderSettings\> | Die Einstellungen für die neue [XmlReader](../)-Instanz. Das Konformitätsniveau des [XmlReaderSettings](../../xmlreadersettings/)-Objekts muss entweder dem Konformitätsniveau des zugrunde liegenden Readers entsprechen oder auf [ConformanceLevel::Auto](../../conformancelevel/) gesetzt werden. |

### ReturnValue

Ein Objekt, das um das angegebene [XmlReader](../)-Objekt gewickelt ist.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&) method


Erstellt eine neue [XmlReader](../)-Instanz mit der angegebenen URI.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputUri | const String\& | Die URI für die Datei, die die XML‑Daten enthält. Die Klasse [XmlUrlResolver](../../xmlurlresolver/) wird verwendet, um den Pfad in eine kanonische Datenrepräsentation zu konvertieren. |

### ReturnValue

Ein Objekt, das verwendet wird, um die XML-Daten im Stream zu lesen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe der angegebenen URI und Einstellungen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputUri | const String\& | Die URI für die Datei, die die XML‑Daten enthält. Das [XmlResolver](../../xmlresolver/)-Objekt des [XmlReaderSettings](../../xmlreadersettings/)-Objekts wird verwendet, um den Pfad in eine kanonische Datenrepräsentation zu konvertieren. Wenn der Wert XmlReaderSettings::get_XmlResolver **nullptr** ist, wird ein neues [XmlUrlResolver](../../xmlurlresolver/)-Objekt verwendet. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |

### ReturnValue

Ein Objekt, das verwendet wird, um die XML-Daten im Stream zu lesen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe der angegebenen URI, Einstellungen und Kontextinformationen zum Parsen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputUri | const String\& | Die URI für die Datei, die die XML‑Daten enthält. Das [XmlResolver](../../xmlresolver/)-Objekt des [XmlReaderSettings](../../xmlreadersettings/)-Objekts wird verwendet, um den Pfad in eine kanonische Datenrepräsentation zu konvertieren. Wenn der Wert XmlReaderSettings::get_XmlResolver **nullptr** ist, wird ein neues [XmlUrlResolver](../../xmlurlresolver/)-Objekt verwendet. |
| settings | SharedPtr\<XmlReaderSettings\> | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Die Kontextinformationen, die zum Parsen des XML‑Fragments erforderlich sind. Die Kontextinformationen können die zu verwendende [XmlNameTable](../../xmlnametable/), die Kodierung, den Namensraum‑Geltungsbereich, den aktuellen **xml:lang**‑ und **xml:space**‑Geltungsbereich, die Basis‑URI und die Dokumenttypdefinition umfassen. Dieser Wert kann **nullptr** sein. |

### ReturnValue

Ein Objekt, das verwendet wird, um die XML-Daten im Stream zu lesen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
