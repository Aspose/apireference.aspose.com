---
title: "Aspose::Page::License::SetLicense विधि"
linktitle: "SetLicense"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::License::SetLicense विधि। C++ में घटक को लाइसेंस करती है।"
type: docs
weight: 400
url: /hi/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


कंपोनेंट को लाइसेंस करता है।

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | System::SharedPtr\<System::IO::Stream\> | एक स्ट्रीम जिसमें लाइसेंस शामिल है। |
## टिप्पणियाँ



एक स्ट्रीम से लाइसेंस लोड करने के लिए इस विधि का उपयोग करें।

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


कंपोनेंट को लाइसेंस करता है।

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## टिप्पणियाँ


लाइसेंस को निम्नलिखित स्थानों में खोजने का प्रयास करता है:

1. स्पष्ट पथ।

<ms>

2. घटक असेंबली का फ़ोल्डर।

3. क्लाइंट की कॉलिंग असेंबली का फ़ोल्डर।

4. एंट्री असेंबली का फ़ोल्डर।

5. क्लाइंट की कॉलिंग असेंबली में एक एम्बेडेड रिसोर्स।

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. स्पष्ट पथ।

2. क्लाइंट की कॉलिंग असेंबली में एक एम्बेडेड रिसोर्स।

</ms>

<java>

2. घटक जार फ़ाइल का फ़ोल्डर।

</java>
## संबंधित देखें

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
