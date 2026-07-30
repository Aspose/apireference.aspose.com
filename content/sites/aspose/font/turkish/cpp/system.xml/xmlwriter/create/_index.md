---
title: "System::Xml::XmlWriter::Create metodu"
linktitle: "Create"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlWriter::Create metodu. Belirtilen akışı kullanarak C++'ta yeni bir XmlWriter örneği oluşturur."
type: docs
weight: 3700
url: /tr/cpp/system.xml/xmlwriter/create/
---
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&) method


Belirtilen akışı kullanarak yeni bir [XmlWriter](../) örneği oluşturur.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | Yazmak istediğiniz akış. [XmlWriter](../) XML 1.0 metin sözdizimini yazar ve belirtilen akışa ekler. |

### ReturnValue

Bir [XmlWriter](../) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) method


Akışı ve [XmlWriterSettings](../../xmlwritersettings/) nesnesini kullanarak yeni bir [XmlWriter](../) örneği oluşturur.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | Yazmak istediğiniz akış. [XmlWriter](../) XML 1.0 metin sözdizimini yazar ve belirtilen akışa ekler. |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/) nesnesi, yeni [XmlWriter](../) örneğini yapılandırmak için kullanılır. Eğer bu **nullptr** ise, varsayılan ayarlarla bir [XmlWriterSettings](../../xmlwritersettings/) kullanılır. Eğer [XmlWriter](../) XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) metodu ile kullanılıyorsa, doğru ayarlarla bir [XmlWriterSettings](../../xmlwritersettings/) nesnesi elde etmek için XslCompiledTransform::get_OutputSettings değerini kullanmalısınız. Bu, oluşturulan [XmlWriter](../) nesnesinin doğru çıktı ayarlarına sahip olmasını sağlar. |

### ReturnValue

Bir [XmlWriter](../) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&) method


Belirtilen TextWriter'ı kullanarak yeni bir [XmlWriter](../) örneği oluşturur.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | Yazmak istediğiniz TextWriter. [XmlWriter](../) XML 1.0 metin sözdizimini yazar ve belirtilen TextWriter'a ekler. |

### ReturnValue

Bir [XmlWriter](../) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


TextWriter ve [XmlWriterSettings](../../xmlwritersettings/) nesnelerini kullanarak yeni bir [XmlWriter](../) örneği oluşturur.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | Yazmak istediğiniz TextWriter. [XmlWriter](../) XML 1.0 metin sözdizimini yazar ve belirtilen TextWriter'a ekler. |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/) nesnesi, yeni [XmlWriter](../) örneğini yapılandırmak için kullanılır. Eğer bu **nullptr** ise, varsayılan ayarlarla bir [XmlWriterSettings](../../xmlwritersettings/) kullanılır. Eğer [XmlWriter](../) XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) metodu ile kullanılıyorsa, doğru ayarlarla bir [XmlWriterSettings](../../xmlwritersettings/) nesnesi elde etmek için XslCompiledTransform::get_OutputSettings değerini kullanmalısınız. Bu, oluşturulan [XmlWriter](../) nesnesinin doğru çıktı ayarlarına sahip olmasını sağlar. |

### ReturnValue

Bir [XmlWriter](../) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&) method


Belirtilen [Text::StringBuilder](../../../system.text/stringbuilder/) kullanarak yeni bir [XmlWriter](../) örneği oluşturur.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | Yazılacak [Text::StringBuilder](../../../system.text/stringbuilder/). [XmlWriter](../) tarafından yazılan içerik, [Text::StringBuilder](../../../system.text/stringbuilder/) üzerine eklenir. |

### ReturnValue

Bir [XmlWriter](../) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) method


[Text::StringBuilder](../../../system.text/stringbuilder/) ve [XmlWriterSettings](../../xmlwritersettings/) nesnelerini kullanarak yeni bir [XmlWriter](../) örneği oluşturur.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | Yazılacak [Text::StringBuilder](../../../system.text/stringbuilder/). [XmlWriter](../) tarafından yazılan içerik, [Text::StringBuilder](../../../system.text/stringbuilder/) üzerine eklenir. |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/) nesnesi, yeni [XmlWriter](../) örneğini yapılandırmak için kullanılır. Eğer bu **nullptr** ise, varsayılan ayarlarla bir [XmlWriterSettings](../../xmlwritersettings/) kullanılır. Eğer [XmlWriter](../) XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) metodu ile kullanılıyorsa, doğru ayarlarla bir [XmlWriterSettings](../../xmlwritersettings/) nesnesi elde etmek için XslCompiledTransform::get_OutputSettings değerini kullanmalısınız. Bu, oluşturulan [XmlWriter](../) nesnesinin doğru çıktı ayarlarına sahip olmasını sağlar. |

### ReturnValue

Bir [XmlWriter](../) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&) method


Belirtilen [XmlWriter](../) nesnesini kullanarak yeni bir [XmlWriter](../) örneği oluşturur.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | Temel yazar olarak kullanmak istediğiniz [XmlWriter](../) nesnesi. |

### ReturnValue

Belirtilen [XmlWriter](../) nesnesinin etrafına sarılmış bir [XmlWriter](../) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Belirtilen [XmlWriter](../) ve [XmlWriterSettings](../../xmlwritersettings/) nesnelerini kullanarak yeni bir [XmlWriter](../) örneği oluşturur.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | Temel yazar olarak kullanmak istediğiniz [XmlWriter](../) nesnesi. |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/) nesnesi, yeni [XmlWriter](../) örneğini yapılandırmak için kullanılır. Eğer bu **nullptr** ise, varsayılan ayarlarla bir [XmlWriterSettings](../../xmlwritersettings/) kullanılır. Eğer [XmlWriter](../) XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) metodu ile kullanılıyorsa, doğru ayarlarla bir [XmlWriterSettings](../../xmlwritersettings/) nesnesi elde etmek için XslCompiledTransform::get_OutputSettings değerini kullanmalısınız. Bu, oluşturulan [XmlWriter](../) nesnesinin doğru çıktı ayarlarına sahip olmasını sağlar. |

### ReturnValue

Belirtilen [XmlWriter](../) nesnesinin etrafına sarılmış bir [XmlWriter](../) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const String\&) method


Belirtilen dosya adını kullanarak yeni bir [XmlWriter](../) örneği oluşturur.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| outputFileName | const String\& | Yazmak istediğiniz dosya. [XmlWriter](../) belirtilen yolda bir dosya oluşturur ve ona XML 1.0 metin sözdizimiyle yazar. **outputFileName** bir dosya sistemi yolu olmalıdır. |

### ReturnValue

Bir [XmlWriter](../) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const String\&, SharedPtr\<XmlWriterSettings\>) method


Dosya adı ve [XmlWriterSettings](../../xmlwritersettings/) nesnesini kullanarak yeni bir [XmlWriter](../) örneği oluşturur.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName, SharedPtr<XmlWriterSettings> settings)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| outputFileName | const String\& | Yazmak istediğiniz dosya. [XmlWriter](../) belirtilen yolda bir dosya oluşturur ve ona XML 1.0 metin sözdizimiyle yazar. **outputFileName** bir dosya sistemi yolu olmalıdır. |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/) nesnesi, yeni [XmlWriter](../) örneğini yapılandırmak için kullanılır. Eğer bu **nullptr** ise, varsayılan ayarlarla bir [XmlWriterSettings](../../xmlwritersettings/) kullanılır. Eğer [XmlWriter](../) XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) metodu ile kullanılıyorsa, doğru ayarlarla bir [XmlWriterSettings](../../xmlwritersettings/) nesnesi elde etmek için XslCompiledTransform::get_OutputSettings değerini kullanmalısınız. Bu, oluşturulan [XmlWriter](../) nesnesinin doğru çıktı ayarlarına sahip olmasını sağlar. |

### ReturnValue

Bir [XmlWriter](../) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
