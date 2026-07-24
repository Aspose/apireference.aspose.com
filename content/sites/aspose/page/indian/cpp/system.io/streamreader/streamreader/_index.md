---
title: "System::IO::StreamReader::StreamReader कंस्ट्रक्टर"
linktitle: "StreamReader"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::StreamReader::StreamReader कंस्ट्रक्टर. C++ में UTF-8 एन्कोडिंग और 1024 बाइट्स के डिफ़ॉल्ट आकार के बफ़र का उपयोग करके निर्दिष्ट अंतर्निहित स्ट्रीम से अक्षर पढ़ने वाले StreamReader ऑब्जेक्ट का एक उदाहरण बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


निर्दिष्ट अंतर्निहित स्ट्रीम से UTF-8 एन्कोडिंग और 1024 बाइट्स के डिफ़ॉल्ट आकार के बफ़र का उपयोग करके अक्षर पढ़ने वाले [StreamReader](../) ऑब्जेक्ट का एक उदाहरण बनाता है।

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const SharedPtr\<Stream\>\& | अक्षर पढ़ने के लिए अंतर्निहित स्ट्रीम |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


निर्दिष्ट अंतर्निहित स्ट्रीम से UTF-8 एन्कोडिंग और 1024 बाइट्स के डिफ़ॉल्ट आकार के बफ़र का उपयोग करके अक्षर पढ़ने वाले [StreamReader](../) ऑब्जेक्ट का एक उदाहरण बनाता है। एक पैरामीटर यह निर्दिष्ट करता है कि बाइट ऑर्डर मार्क डिटेक्शन सक्षम होना चाहिए या नहीं।

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const SharedPtr\<Stream\>\& | अक्षर पढ़ने के लिए अंतर्निहित स्ट्रीम |
| detectEncodingFromByteOrderMarks | bool | स्ट्रीम की शुरुआत में बाइट ऑर्डर मार्क खोजने के लिए true, अन्यथा false |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


निर्दिष्ट अंतर्निहित स्ट्रीम से निर्दिष्ट एन्कोडिंग और 1024 बाइट्स के डिफ़ॉल्ट आकार के बफ़र का उपयोग करके अक्षर पढ़ने वाले [StreamReader](../) ऑब्जेक्ट का एक उदाहरण बनाता है।

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const SharedPtr\<Stream\>\& | अक्षर पढ़ने के लिए अंतर्निहित स्ट्रीम |
| encoding | const EncodingPtr\& | उपयोग करने के लिए एन्कोडिंग |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


निर्दिष्ट अंतर्निहित स्ट्रीम से निर्दिष्ट एन्कोडिंग और 1024 बाइट्स के डिफ़ॉल्ट आकार के बफ़र का उपयोग करके अक्षर पढ़ने वाले [StreamReader](../) ऑब्जेक्ट का एक उदाहरण बनाता है। एक पैरामीटर यह निर्दिष्ट करता है कि बाइट ऑर्डर मार्क डिटेक्शन सक्षम होना चाहिए या नहीं।

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const SharedPtr\<Stream\>\& | अक्षर पढ़ने के लिए अंतर्निहित स्ट्रीम |
| encoding | const EncodingPtr\& | उपयोग करने के लिए एन्कोडिंग |
| detectEncodingFromByteOrderMarks | bool | स्ट्रीम की शुरुआत में बाइट ऑर्डर मार्क खोजने के लिए true, अन्यथा false |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


निर्दिष्ट अंतर्निहित स्ट्रीम से निर्दिष्ट एन्कोडिंग और निर्दिष्ट आकार के बफ़र का उपयोग करके अक्षर पढ़ने वाले [StreamReader](../) ऑब्जेक्ट का एक उदाहरण बनाता है। एक पैरामीटर यह निर्दिष्ट करता है कि बाइट ऑर्डर मार्क डिटेक्शन सक्षम होना चाहिए या नहीं।

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const SharedPtr\<Stream\>\& | अक्षर पढ़ने के लिए अंतर्निहित स्ट्रीम |
| encoding | const EncodingPtr\& | उपयोग करने के लिए एन्कोडिंग |
| detectEncodingFromByteOrderMarks | bool | स्ट्रीम की शुरुआत में बाइट ऑर्डर मार्क खोजने के लिए true, अन्यथा false |
| bufferSize | int | बफ़र का न्यूनतम आकार बाइट्स में |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


निर्दिष्ट फ़ाइल से UTF-8 एन्कोडिंग और 4096 बाइट्स के डिफ़ॉल्ट आकार के बफ़र का उपयोग करके अक्षर पढ़ने वाले [StreamReader](../) ऑब्जेक्ट का एक उदाहरण बनाता है।

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const System::String\& | अक्षर पढ़ने के लिए फ़ाइल का पथ |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


निर्दिष्ट फ़ाइल से UTF-8 एन्कोडिंग और 4096 बाइट्स के डिफ़ॉल्ट आकार के बफ़र का उपयोग करके अक्षर पढ़ने वाले [StreamReader](../) ऑब्जेक्ट का एक उदाहरण बनाता है। एक पैरामीटर यह निर्दिष्ट करता है कि बाइट ऑर्डर मार्क डिटेक्शन सक्षम होना चाहिए या नहीं।

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const System::String\& | अक्षर पढ़ने के लिए फ़ाइल का पथ |
| detectEncodingFromByteOrderMarks | bool | फ़ाइल की शुरुआत में बाइट ऑर्डर मार्क्स की जाँच करने के लिए True, अन्यथा - false |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


निर्दिष्ट एन्कोडिंग का उपयोग करके निर्दिष्ट फ़ाइल से अक्षर पढ़ने वाले [StreamReader](../) ऑब्जेक्ट का एक इंस्टेंस बनाता है और 4096 बाइट्स के डिफ़ॉल्ट आकार वाले बफ़र का उपयोग करता है।

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const System::String\& | अक्षर पढ़ने के लिए फ़ाइल का पथ |
| encoding | const EncodingPtr\& | उपयोग करने के लिए एन्कोडिंग |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


निर्दिष्ट एन्कोडिंग का उपयोग करके निर्दिष्ट अंतर्निहित स्ट्रीम से अक्षर पढ़ने वाले [StreamReader](../) ऑब्जेक्ट का एक इंस्टेंस बनाता है और 4096 बाइट्स के डिफ़ॉल्ट आकार वाले बफ़र का उपयोग करता है। एक पैरामीटर यह निर्दिष्ट करता है कि बाइट ऑर्डर मार्क डिटेक्शन सक्षम होना चाहिए या नहीं।

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const System::String\& | अक्षर पढ़ने के लिए फ़ाइल का पथ |
| encoding | const EncodingPtr\& | उपयोग करने के लिए एन्कोडिंग |
| detectEncodingFromByteOrderMarks | bool | फ़ाइल की शुरुआत में बाइट ऑर्डर मार्क्स की जाँच करने के लिए True, अन्यथा - false |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


निर्दिष्ट एन्कोडिंग का उपयोग करके निर्दिष्ट फ़ाइल से अक्षर पढ़ने वाले [StreamReader](../) ऑब्जेक्ट का एक इंस्टेंस बनाता है और निर्दिष्ट आकार के बफ़र का उपयोग करता है। एक पैरामीटर यह निर्दिष्ट करता है कि बाइट ऑर्डर मार्क डिटेक्शन सक्षम होना चाहिए या नहीं।

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const System::String\& | अक्षर पढ़ने के लिए फ़ाइल का पथ |
| encoding | const EncodingPtr\& | उपयोग करने के लिए एन्कोडिंग |
| detectEncodingFromByteOrderMarks | bool | फ़ाइल की शुरुआत में बाइट ऑर्डर मार्क्स की जाँच करने के लिए True, अन्यथा - false |
| bufferSize | int | बफ़र का न्यूनतम आकार बाइट्स में |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
