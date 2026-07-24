---
title: "System::IO::StreamWriter::StreamWriter constructor"
linktitle: "StreamWriter"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::StreamWriter::StreamWriter constructor. C++ में UTF-8 एन्कोडिंग और 1024 बाइट्स के डिफ़ॉल्ट आकार के बफ़र का उपयोग करके निर्दिष्ट अंतर्निहित स्ट्रीम में अक्षर लिखने वाले StreamWriter ऑब्जेक्ट का एक इंस्टेंस बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


UTF-8 एन्कोडिंग और 1024 बाइट्स के डिफ़ॉल्ट आकार के बफ़र का उपयोग करके निर्दिष्ट अंतर्निहित स्ट्रीम में अक्षर लिखने वाले [StreamWriter](../) ऑब्जेक्ट का एक इंस्टेंस बनाता है।

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const SharedPtr\<Stream\>\& | अक्षर लिखने के लिए आधारभूत स्ट्रीम |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


निर्दिष्ट एन्कोडिंग का उपयोग करके और 1024 बाइट्स के डिफ़ॉल्ट आकार वाले बफ़र के साथ निर्दिष्ट आधारभूत स्ट्रीम में अक्षर लिखने वाले [StreamWriter](../) ऑब्जेक्ट का एक उदाहरण बनाता है।

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const SharedPtr\<Stream\>\& | अक्षर लिखने के लिए आधारभूत स्ट्रीम |
| encoding | const EncodingPtr\& | उपयोग करने के लिए एन्कोडिंग |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


निर्दिष्ट एन्कोडिंग का उपयोग करके और निर्दिष्ट आकार के बफ़र के साथ निर्दिष्ट आधारभूत स्ट्रीम में अक्षर लिखने वाले [StreamWriter](../) ऑब्जेक्ट का एक उदाहरण बनाता है। एक पैरामीटर यह निर्दिष्ट करता है कि जब [StreamWriter](../) ऑब्जेक्ट नष्ट किया जाए तो आधारभूत स्ट्रीम बंद की जानी चाहिए या नहीं।

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const SharedPtr\<Stream\>\& | अक्षर लिखने के लिए आधारभूत स्ट्रीम |
| encoding | const EncodingPtr\& | उपयोग करने के लिए एन्कोडिंग |
| buffer_size | int | बफ़र का न्यूनतम आकार बाइट्स में |
| leave_open | bool | निर्दिष्ट करता है कि वर्तमान [StreamWriter](../) ऑब्जेक्ट नष्ट होने के बाद आधारभूत स्ट्रीम खुली रखी जानी चाहिए या नहीं |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


UTF-8 एन्कोडिंग का उपयोग करके और 1024 बाइट्स के डिफ़ॉल्ट आकार वाले बफ़र के साथ निर्दिष्ट फ़ाइल में अक्षर लिखने वाले [StreamWriter](../) ऑब्जेक्ट का एक उदाहरण बनाता है।

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | अक्षर लिखने के लिए फ़ाइल का पथ |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


निर्दिष्ट एन्कोडिंग और बफ़र आकार का उपयोग करके निर्दिष्ट फ़ाइल में अक्षर लिखने वाले [StreamWriter](../) ऑब्जेक्ट का एक उदाहरण बनाता है। एक पैरामीटर यह निर्दिष्ट करता है कि डेटा फ़ाइल में जोड़ा जाना चाहिए या फ़ाइल को अधिलेखित किया जाना चाहिए।

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | अक्षर लिखने के लिए फ़ाइल का पथ |
| append | bool | निर्दिष्ट करता है कि डेटा निर्दिष्ट फ़ाइल में जोड़ा जाना चाहिए (true) या फ़ाइल को अधिलेखित किया जाना चाहिए (false) |
| encoding | const EncodingPtr\& | उपयोग करने के लिए एन्कोडिंग |
| buffer_size | int | उपयोग करने के लिए बफ़र का आकार |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


निर्दिष्ट एन्कोडिंग का उपयोग करके और 1024 बाइट्स के डिफ़ॉल्ट आकार वाले बफ़र के साथ निर्दिष्ट फ़ाइल में अक्षर लिखने वाले [StreamWriter](../) ऑब्जेक्ट का एक उदाहरण बनाता है। एक पैरामीटर यह निर्दिष्ट करता है कि डेटा फ़ाइल में जोड़ा जाना चाहिए या फ़ाइल को अधिलेखित किया जाना चाहिए।

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | अक्षर लिखने के लिए फ़ाइल का पथ |
| append | bool | निर्दिष्ट करता है कि डेटा निर्दिष्ट फ़ाइल में जोड़ा जाना चाहिए (true) या फ़ाइल को अधिलेखित किया जाना चाहिए (false) |
| encoding | const EncodingPtr\& | उपयोग करने के लिए एन्कोडिंग |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
