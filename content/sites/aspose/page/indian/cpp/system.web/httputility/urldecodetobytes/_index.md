---
title: "System::Web::HttpUtility::UrlDecodeToBytes विधि"
linktitle: "UrlDecodeToBytes"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::HttpUtility::UrlDecodeToBytes विधि. C++ में बाइट्स स्ट्रिंग से URI फ्रैगमेंट को डिकोड करता है।"
type: docs
weight: 400
url: /hi/cpp/system.web/httputility/urldecodetobytes/
---
## HttpUtility::UrlDecodeToBytes(const String\&) method


बाइट्स स्ट्रिंग से URI फ्रैगमेंट को डिकोड करता है।

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | एन्कोड किया गया URI फ्रैगमेंट। |

### ReturnValue

डिकोड किया गया URI फ्रैगमेंट।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


स्ट्रिंग से URI फ्रैगमेंट को डिकोड करता है।

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | एन्कोड किया गया URI फ्रैगमेंट। |
| e | const System::SharedPtr\<Text::Encoding\>\& | उपयोग करने के लिए एन्कोडिंग। |

### ReturnValue

डिकोड किया गया URI फ्रैगमेंट।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


बाइट्स एरे से URI फ्रैगमेंट को डिकोड करता है।

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाइट्स | const System::ArrayPtr\<uint8_t\>\& | एन्कोड किया गया URI फ्रैगमेंट। |

### ReturnValue

डिकोड किया गया URI फ्रैगमेंट।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


बाइट्स एरे से URI फ्रैगमेंट को डिकोड करता है।

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाइट्स | const System::ArrayPtr\<uint8_t\>\& | एन्कोड किया गया URI फ्रैगमेंट। |
| offset | int32_t | दिए गए बाइट एरे में ऑफसेट। |
| count | int32_t | पढ़ने के लिए बाइट्स की संख्या। |

### ReturnValue

डिकोड किया गया URI फ्रैगमेंट।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
