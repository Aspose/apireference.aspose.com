---
title: "System::Web::HttpUtility::UrlDecode विधि"
linktitle: "UrlDecode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::HttpUtility::UrlDecode विधि. C++ में बाइट्स एरे से URI फ्रैगमेंट को डिकोड करता है।"
type: docs
weight: 300
url: /hi/cpp/system.web/httputility/urldecode/
---
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) method


बाइट्स एरे से URI फ्रैगमेंट को डिकोड करता है।

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, const System::SharedPtr<Text::Encoding> &e)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाइट्स | const System::ArrayPtr\<uint8_t\>\& | एन्कोड किया गया URI फ्रैगमेंट। |
| e | const System::SharedPtr\<Text::Encoding\>\& | उपयोग करने के लिए एन्कोडिंग। |

### ReturnValue

डिकोड किया गया URI फ्रैगमेंट।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) method


बाइट्स एरे से URI फ्रैगमेंट को डिकोड करता है।

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count, const System::SharedPtr<Text::Encoding> &e)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाइट्स | const System::ArrayPtr\<uint8_t\>\& | एन्कोड किया गया URI फ्रैगमेंट। |
| offset | int32_t | दिए गए बाइट एरे में ऑफसेट। |
| count | int32_t | पढ़ने के लिए बाइट्स की संख्या। |
| e | const System::SharedPtr\<Text::Encoding\>\& | उपयोग करने के लिए एन्कोडिंग। |

### ReturnValue

डिकोड किया गया URI फ्रैगमेंट।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecode(String) method


स्ट्रिंग से URI फ्रैगमेंट को डिकोड करता है।

```cpp
static String System::Web::HttpUtility::UrlDecode(String str)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | String | एन्कोड किया गया URI फ्रैगमेंट। |

### ReturnValue

डिकोड किया गया URI फ्रैगमेंट।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecode(String, System::SharedPtr\<Text::Encoding\>) method


स्ट्रिंग से URI फ्रैगमेंट को डिकोड करता है।

```cpp
static String System::Web::HttpUtility::UrlDecode(String str, System::SharedPtr<Text::Encoding> e)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | String | एन्कोड किया गया URI फ्रैगमेंट। |
| e | System::SharedPtr\<Text::Encoding\> | उपयोग करने के लिए एन्कोडिंग। |

### ReturnValue

डिकोड किया गया URI फ्रैगमेंट।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
