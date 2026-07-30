---
title: "System::Xml::XmlReader::Create yöntemi"
linktitle: "Create"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::Create yöntemi. Belirtilen akışı varsayılan ayarlarla kullanarak yeni bir XmlReader örneği oluşturur C++'ta."
type: docs
weight: 7700
url: /tr/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


Belirtilen akışı varsayılan ayarlarla kullanarak yeni bir [XmlReader](../) örneği oluşturur.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | XML verilerini içeren akış. [XmlReader](../) akışın ilk baytlarını bir bayt sırası işareti ya da başka bir kodlama işareti için tarar. Kodlama belirlendiğinde, akışı okumaya devam etmek için bu kodlama kullanılır ve işleme, girdiyi (Unicode) karakter akışı olarak ayrıştırmaya devam eder. |

### ReturnValue

Akıştaki XML verilerini okumak için kullanılan bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Belirtilen akış ve ayarlarla yeni bir [XmlReader](../) örneği oluşturur.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | XML verilerini içeren akış. [XmlReader](../) akışın ilk baytlarını bir bayt sırası işareti ya da başka bir kodlama işareti için tarar. Kodlama belirlendiğinde, akışı okumaya devam etmek için bu kodlama kullanılır ve işleme, girdiyi (Unicode) karakter akışı olarak ayrıştırmaya devam eder. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Yeni [XmlReader](../) örneği için ayarlar. Bu değer **nullptr** olabilir. |

### ReturnValue

Akıştaki XML verilerini okumak için kullanılan bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Belirtilen akış, ayarlar ve ayrıştırma için bağlam bilgilerini kullanarak yeni bir [XmlReader](../) örneği oluşturur.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | XML verilerini içeren akış. [XmlReader](../) akışın ilk baytlarını bir bayt sırası işareti ya da başka bir kodlama işareti için tarar. Kodlama belirlendiğinde, akışı okumaya devam etmek için bu kodlama kullanılır ve işleme, girdiyi (Unicode) karakter akışı olarak ayrıştırmaya devam eder. |
| settings | SharedPtr\<XmlReaderSettings\> | Yeni [XmlReader](../) örneği için ayarlar. Bu değer **nullptr** olabilir. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | XML parçacığını ayrıştırmak için gereken bağlam bilgisi. Bağlam bilgisi, kullanılacak [XmlNameTable](../../xmlnametable/), kodlama, ad alanı kapsamı, geçerli **xml:lang** ve **xml:space** kapsamı, temel URI ve belge türü tanımını içerebilir. Bu değer **nullptr** olabilir. |

### ReturnValue

Akıştaki XML verilerini okumak için kullanılan bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Belirtilen akış, temel URI ve ayarları kullanarak yeni bir [XmlReader](../) örneği oluşturur.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | XML verilerini içeren akış. [XmlReader](../) akışın ilk baytlarını bir bayt sırası işareti ya da başka bir kodlama işareti için tarar. Kodlama belirlendiğinde, akışı okumaya devam etmek için bu kodlama kullanılır ve işleme, girdiyi (Unicode) karakter akışı olarak ayrıştırmaya devam eder. |
| settings | SharedPtr\<XmlReaderSettings\> | Yeni [XmlReader](../) örneği için ayarlar. Bu değer **nullptr** olabilir. |
| baseUri | const String\& | Okunan varlık veya belgenin temel URI'si. Bu değer **nullptr** olabilir. **[Security](../../../system.security/) Note** Temel URI, XML belgesinin göreli URI'sini çözmek için kullanılır. Güvenilmeyen bir kaynaktan temel URI kullanılmamalıdır. |

### ReturnValue

Akıştaki XML verilerini okumak için kullanılan bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


Belirtilen metin okuyucusunu kullanarak yeni bir [XmlReader](../) örneği oluşturur.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<IO::TextReader\>\& | XML verisini okuyacağınız metin okuyucu. Metin okuyucu, Unicode karakter akışı döndürdüğü için XML bildiriminde belirtilen kodlama, XML okuyucu tarafından veri akışını çözmek için kullanılmaz. |

### ReturnValue

Akıştaki XML verilerini okumak için kullanılan bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Belirtilen metin okuyucu ve ayarları kullanarak yeni bir [XmlReader](../) örneği oluşturur.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<IO::TextReader\>\& | XML verisini okuyacağınız metin okuyucu. Metin okuyucu, Unicode karakter akışı döndürdüğü için XML bildiriminde belirtilen kodlama, XML okuyucu tarafından veri akışını çözmek için kullanılmaz. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Yeni [XmlReader](../) için ayarlar. Bu değer **nullptr** olabilir. |

### ReturnValue

Akıştaki XML verilerini okumak için kullanılan bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Belirtilen metin okuyucu, ayarlar ve ayrıştırma için bağlam bilgilerini kullanarak yeni bir [XmlReader](../) örneği oluşturur.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<IO::TextReader\>\& | XML verisini okuyacağınız metin okuyucu. Metin okuyucu, Unicode karakter akışı döndürdüğü için XML bildiriminde belirtilen kodlama, XML okuyucu tarafından veri akışını çözmek için kullanılmaz. |
| settings | SharedPtr\<XmlReaderSettings\> | Yeni [XmlReader](../) örneği için ayarlar. Bu değer **nullptr** olabilir. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | XML parçacığını ayrıştırmak için gereken bağlam bilgisi. Bağlam bilgisi, kullanılacak [XmlNameTable](../../xmlnametable/), kodlama, ad alanı kapsamı, geçerli **xml:lang** ve **xml:space** kapsamı, temel URI ve belge türü tanımını içerebilir. Bu değer **nullptr** olabilir. |

### ReturnValue

Akıştaki XML verilerini okumak için kullanılan bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Belirtilen metin okuyucu, ayarlar ve temel URI'yi kullanarak yeni bir [XmlReader](../) örneği oluşturur.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | XML verisini okuyacağınız metin okuyucu. Metin okuyucu, Unicode karakter akışı döndürdüğü için XML bildiriminde belirtilen kodlama, [XmlReader](../) tarafından veri akışını çözmek için kullanılmaz. |
| settings | SharedPtr\<XmlReaderSettings\> | Yeni [XmlReader](../) örneği için ayarlar. Bu değer **nullptr** olabilir. |
| baseUri | const String\& | Okunan varlık veya belgenin temel URI'si. Bu değer **nullptr** olabilir. **[Security](../../../system.security/) Note** Temel URI, XML belgesinin göreli URI'sini çözmek için kullanılır. Güvenilmeyen bir kaynaktan temel URI kullanılmamalıdır. |

### ReturnValue

Akıştaki XML verilerini okumak için kullanılan bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


Belirtilen XML okuyucu ve ayarları kullanarak yeni bir [XmlReader](../) örneği oluşturur.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| okuyucu | const SharedPtr\<XmlReader\>\& | Temel XML okuyucu olarak kullanmak istediğiniz nesne. |
| settings | SharedPtr\<XmlReaderSettings\> | Yeni [XmlReader](../) örneği için ayarlar. [XmlReaderSettings](../../xmlreadersettings/) nesnesinin uyumluluk düzeyi, temel okuyucunun uyumluluk düzeyiyle eşleşmelidir veya [ConformanceLevel::Auto](../../conformancelevel/) olarak ayarlanmalıdır. |

### ReturnValue

Belirtilen [XmlReader](../) nesnesinin etrafına sarılmış bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&) method


Belirtilen URI ile yeni bir [XmlReader](../) örneği oluşturur.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputUri | const String\& | XML verisini içeren dosyanın URI'si. [XmlUrlResolver](../../xmlurlresolver/) sınıfı, yolu kanonik bir veri temsiline dönüştürmek için kullanılır. |

### ReturnValue

Akıştaki XML verilerini okumak için kullanılan bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


Belirtilen URI ve ayarları kullanarak yeni bir [XmlReader](../) örneği oluşturur.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputUri | const String\& | XML verisini içeren dosyanın URI'si. [XmlReaderSettings](../../xmlreadersettings/) nesnesindeki [XmlResolver](../../xmlresolver/) nesnesi, yolu kanonik bir veri temsiline dönüştürmek için kullanılır. XmlReaderSettings::get_XmlResolver değeri **nullptr** ise, yeni bir [XmlUrlResolver](../../xmlurlresolver/) nesnesi kullanılır. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Yeni [XmlReader](../) örneği için ayarlar. Bu değer **nullptr** olabilir. |

### ReturnValue

Akıştaki XML verilerini okumak için kullanılan bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Belirtilen URI, ayarlar ve ayrıştırma için bağlam bilgilerini kullanarak yeni bir [XmlReader](../) örneği oluşturur.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputUri | const String\& | XML verisini içeren dosyanın URI'si. [XmlReaderSettings](../../xmlreadersettings/) nesnesindeki [XmlResolver](../../xmlresolver/) nesnesi, yolu kanonik bir veri temsiline dönüştürmek için kullanılır. XmlReaderSettings::get_XmlResolver değeri **nullptr** ise, yeni bir [XmlUrlResolver](../../xmlurlresolver/) nesnesi kullanılır. |
| settings | SharedPtr\<XmlReaderSettings\> | Yeni [XmlReader](../) örneği için ayarlar. Bu değer **nullptr** olabilir. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | XML parçacığını ayrıştırmak için gereken bağlam bilgisi. Bağlam bilgisi, kullanılacak [XmlNameTable](../../xmlnametable/), kodlama, ad alanı kapsamı, geçerli **xml:lang** ve **xml:space** kapsamı, temel URI ve belge türü tanımını içerebilir. Bu değer **nullptr** olabilir. |

### ReturnValue

Akıştaki XML verilerini okumak için kullanılan bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
