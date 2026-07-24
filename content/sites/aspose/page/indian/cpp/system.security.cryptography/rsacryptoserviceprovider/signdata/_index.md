---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignData मेथड"
linktitle: "SignData"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignData मेथड। निर्दिष्ट इनपुट मान के हस्ताक्षर को C++ में गणना करता है।"
type: docs
weight: 1600
url: /hi/cpp/system.security.cryptography/rsacryptoserviceprovider/signdata/
---
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) method


निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है।

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) से इनपुट डेटा पढ़ने के लिए। |
| halg | const SharedPtr\<Object\>\& | उपयोग करने के लिए हैश एल्गोरिद्म। |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) method


निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है।

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count, const SharedPtr<Object> &halg)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) से इनपुट डेटा पढ़ने के लिए। |
| offset | int32_t | इनपुट बफ़र स्लाइस की प्रारंभिक सूचकांक। |
| count | int32_t | इनपुट बफ़र स्लाइस का आकार। |
| halg | const SharedPtr\<Object\>\& | उपयोग करने के लिए हैश एल्गोरिद्म। |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) method


निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है।

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream, const SharedPtr<Object> &halg)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | हस्ताक्षर किए जा रहे डेटा को पढ़ने के लिए स्ट्रीम। |
| halg | const SharedPtr\<Object\>\& | उपयोग करने के लिए हैश एल्गोरिद्म। |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
