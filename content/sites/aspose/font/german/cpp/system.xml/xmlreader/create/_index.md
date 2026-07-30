---
title: "System::Xml::XmlReader::Create Methode"
linktitle: "Create"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::Create Methode. Erstellt eine neue XmlReader-Instanz, die den angegebenen Stream mit Standardeinstellungen in C++ verwendet."
type: docs
weight: 7700
url: /de/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz, die den angegebenen Stream mit Standardeinstellungen verwendet.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Der Stream, der die XML-Daten enthält. Der [XmlReader](../) scannt die ersten Bytes des Streams, um nach einem Byte Order Mark oder anderen Hinweisen auf die Kodierung zu suchen. Sobald die Kodierung ermittelt ist, wird sie verwendet, um das Lesen des Streams fortzusetzen, und die Verarbeitung fährt fort, die Eingabe als Stream von (Unicode-)Zeichen zu parsen. |

### ReturnValue

Ein Objekt, das zum Lesen der XML-Daten im Stream verwendet wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz mit dem angegebenen Stream und den Einstellungen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Der Stream, der die XML-Daten enthält. Der [XmlReader](../) scannt die ersten Bytes des Streams, um nach einem Byte Order Mark oder anderen Hinweisen auf die Kodierung zu suchen. Sobald die Kodierung ermittelt ist, wird sie verwendet, um das Lesen des Streams fortzusetzen, und die Verarbeitung fährt fort, die Eingabe als Stream von (Unicode-)Zeichen zu parsen. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |

### ReturnValue

Ein Objekt, das zum Lesen der XML-Daten im Stream verwendet wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz unter Verwendung des angegebenen Streams, der Einstellungen und der Kontextinformationen zum Parsen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Der Stream, der die XML-Daten enthält. Der [XmlReader](../) scannt die ersten Bytes des Streams, um nach einem Byte Order Mark oder anderen Hinweisen auf die Kodierung zu suchen. Sobald die Kodierung ermittelt ist, wird sie verwendet, um das Lesen des Streams fortzusetzen, und die Verarbeitung fährt fort, die Eingabe als Stream von (Unicode-)Zeichen zu parsen. |
| settings | SharedPtr\<XmlReaderSettings\> | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Die Kontextinformationen, die zum Parsen des XML‑Fragments erforderlich sind. Die Kontextinformationen können die zu verwendende [XmlNameTable](../../xmlnametable/), die Kodierung, den Namensraum‑Geltungsbereich, den aktuellen **xml:lang**‑ und **xml:space**‑Geltungsbereich, die Basis‑URI und die Dokumenttypdefinition umfassen. Dieser Wert kann **nullptr** sein. |

### ReturnValue

Ein Objekt, das zum Lesen der XML-Daten im Stream verwendet wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Erstellt eine neue [XmlReader](../)-Instanz unter Verwendung des angegebenen Streams, der Basis‑URI und der Einstellungen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Der Stream, der die XML-Daten enthält. Der [XmlReader](../) scannt die ersten Bytes des Streams, um nach einem Byte Order Mark oder anderen Hinweisen auf die Kodierung zu suchen. Sobald die Kodierung ermittelt ist, wird sie verwendet, um das Lesen des Streams fortzusetzen, und die Verarbeitung fährt fort, die Eingabe als Stream von (Unicode-)Zeichen zu parsen. |
| settings | SharedPtr\<XmlReaderSettings\> | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |
| baseUri | const String\& | Die Basis‑URI für die zu lesende Entität oder das Dokument. Dieser Wert kann **nullptr** sein. **[Security](../../../system.security/) Hinweis** Die Basis‑URI wird verwendet, um die relative URI des XML‑Dokuments aufzulösen. Verwenden Sie keine Basis‑URI aus einer nicht vertrauenswürdigen Quelle. |

### ReturnValue

Ein Objekt, das zum Lesen der XML-Daten im Stream verwendet wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe des angegebenen Textreaders.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<IO::TextReader\>\& | Der Textleser, aus dem die XML‑Daten gelesen werden. Ein Textleser liefert einen Strom von Unicode‑Zeichen, sodass die im XML‑Deklaration angegebene Kodierung vom XML‑Reader nicht zum Dekodieren des Datenstroms verwendet wird. |

### ReturnValue

Ein Objekt, das zum Lesen der XML-Daten im Stream verwendet wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe des angegebenen Textreaders und der Einstellungen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<IO::TextReader\>\& | Der Textleser, aus dem die XML‑Daten gelesen werden. Ein Textleser liefert einen Strom von Unicode‑Zeichen, sodass die im XML‑Deklaration angegebene Kodierung vom XML‑Reader nicht zum Dekodieren des Datenstroms verwendet wird. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |

### ReturnValue

Ein Objekt, das zum Lesen der XML-Daten im Stream verwendet wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe des angegebenen Textreaders, der Einstellungen und der Kontextinformationen zum Parsen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<IO::TextReader\>\& | Der Textleser, aus dem die XML‑Daten gelesen werden. Ein Textleser liefert einen Strom von Unicode‑Zeichen, sodass die im XML‑Deklaration angegebene Kodierung vom XML‑Reader nicht zum Dekodieren des Datenstroms verwendet wird. |
| settings | SharedPtr\<XmlReaderSettings\> | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Die Kontextinformationen, die zum Parsen des XML‑Fragments erforderlich sind. Die Kontextinformationen können die zu verwendende [XmlNameTable](../../xmlnametable/), die Kodierung, den Namensraum‑Geltungsbereich, den aktuellen **xml:lang**‑ und **xml:space**‑Geltungsbereich, die Basis‑URI und die Dokumenttypdefinition umfassen. Dieser Wert kann **nullptr** sein. |

### ReturnValue

Ein Objekt, das zum Lesen der XML-Daten im Stream verwendet wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe des angegebenen Textreaders, der Einstellungen und der Basis‑URI.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Der Textleser, aus dem die XML‑Daten gelesen werden. Ein Textleser liefert einen Strom von Unicode‑Zeichen, sodass die im XML‑Deklaration angegebene Kodierung vom [XmlReader](../) nicht zum Dekodieren des Datenstroms verwendet wird. |
| settings | SharedPtr\<XmlReaderSettings\> | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |
| baseUri | const String\& | Die Basis‑URI für die zu lesende Entität oder das Dokument. Dieser Wert kann **nullptr** sein. **[Security](../../../system.security/) Hinweis** Die Basis‑URI wird verwendet, um die relative URI des XML‑Dokuments aufzulösen. Verwenden Sie keine Basis‑URI aus einer nicht vertrauenswürdigen Quelle. |

### ReturnValue

Ein Objekt, das zum Lesen der XML-Daten im Stream verwendet wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
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
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&) method


Erstellt eine neue [XmlReader](../)-Instanz mit angegebener URI.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputUri | const String\& | Die URI für die Datei, die die XML‑Daten enthält. Die Klasse [XmlUrlResolver](../../xmlurlresolver/) wird verwendet, um den Pfad in eine kanonische Datenrepräsentation zu konvertieren. |

### ReturnValue

Ein Objekt, das zum Lesen der XML-Daten im Stream verwendet wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe der angegebenen URI und der Einstellungen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputUri | const String\& | Die URI für die Datei, die die XML‑Daten enthält. Das [XmlResolver](../../xmlresolver/)-Objekt des [XmlReaderSettings](../../xmlreadersettings/)-Objekts wird verwendet, um den Pfad in eine kanonische Datenrepräsentation zu konvertieren. Wenn der Wert XmlReaderSettings::get_XmlResolver **nullptr** ist, wird ein neues [XmlUrlResolver](../../xmlurlresolver/)-Objekt verwendet. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |

### ReturnValue

Ein Objekt, das zum Lesen der XML-Daten im Stream verwendet wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Erstellt eine neue [XmlReader](../)-Instanz mithilfe der angegebenen URI, der Einstellungen und der Kontextinformationen zum Parsen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputUri | const String\& | Die URI für die Datei, die die XML‑Daten enthält. Das [XmlResolver](../../xmlresolver/)-Objekt des [XmlReaderSettings](../../xmlreadersettings/)-Objekts wird verwendet, um den Pfad in eine kanonische Datenrepräsentation zu konvertieren. Wenn der Wert XmlReaderSettings::get_XmlResolver **nullptr** ist, wird ein neues [XmlUrlResolver](../../xmlurlresolver/)-Objekt verwendet. |
| settings | SharedPtr\<XmlReaderSettings\> | Die Einstellungen für die neue [XmlReader](../)-Instanz. Dieser Wert kann **nullptr** sein. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Die Kontextinformationen, die zum Parsen des XML‑Fragments erforderlich sind. Die Kontextinformationen können die zu verwendende [XmlNameTable](../../xmlnametable/), die Kodierung, den Namensraum‑Geltungsbereich, den aktuellen **xml:lang**‑ und **xml:space**‑Geltungsbereich, die Basis‑URI und die Dokumenttypdefinition umfassen. Dieser Wert kann **nullptr** sein. |

### ReturnValue

Ein Objekt, das zum Lesen der XML-Daten im Stream verwendet wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
