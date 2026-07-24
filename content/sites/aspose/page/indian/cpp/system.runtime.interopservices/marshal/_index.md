---
title: "System::Runtime::InteropServices::Marshal क्लास"
linktitle: "Marshal"
second_title: "Aspose.Page C++ के लिए"
description: "System::Runtime::InteropServices::Marshal क्लास। मारshalling कार्यान्वयन प्रदान करता है। केवल अनुवादित कोड के साथ संगतता के लिए, क्योंकि C++ पक्ष पर कोई प्रबंधित कोड समर्थित नहीं है। यह एक स्थैतिक प्रकार है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको C++ में किसी भी तरह से इसके इंस्टेंस नहीं बनाना चाहिए।"
type: docs
weight: 100
url: /hi/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


मार्शलिंग कार्यान्वयन प्रदान करता है। केवल अनुवादित कोड के साथ संगतता के लिए, क्योंकि C++ पक्ष पर कोई मैनेज्ड कोड समर्थित नहीं है। यह एक स्थैतिक प्रकार है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको इसे किसी भी तरह से इंस्टेंस नहीं बनाना चाहिए।

```cpp
class Marshal
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | अप्रबंधित मेमोरी आवंटित करता है। |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | अप्रबंधित मेमोरी आवंटित करता है। |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) सेमांटिक्स को लागू करता है। |
| static [Copy](./copy/)(const void *, container\&&, int, int) | public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) सेमांटिक्स को लागू करता है। |
| static [Copy](./copy/)(const container\&, int, void *, int) | public static void Copy(char[] source, int startIndex, IntPtr destination, int length) को लागू करता है। |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | public static void Copy(char[] source, int startIndex, IntPtr destination, int length) को लागू करता है। |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | अप्रबंधित मेमोरी मुक्त करता है। |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | अपवाद से HResult प्राप्त करता है। |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | एक अप्रबंधित शून्य-समाप्त UTF8-स्ट्रिंग से एक प्रबंधित [String](../../system/string/) बनाता है। |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | एक अप्रबंधित UTF8-स्ट्रिंग से एक प्रबंधित [String](../../system/string/) बनाता है। |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | एक अप्रबंधित शून्य-समाप्त स्ट्रिंग से एक प्रबंधित [String](../../system/string/) बनाता है। |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | एक अप्रबंधित स्ट्रिंग से एक प्रबंधित [String](../../system/string/) बनाता है। |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | एक अप्रबंधित शून्य-समाप्त यूनिकोड स्ट्रिंग से एक प्रबंधित [String](../../system/string/) बनाता है। |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | एक अप्रबंधित यूनिकोड स्ट्रिंग से एक प्रबंधित [String](../../system/string/) बनाता है। |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | एक अप्रबंधित शून्य-समाप्त UTF8-स्ट्रिंग से एक प्रबंधित [String](../../system/string/) बनाता है। |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | एक अप्रबंधित UTF8-स्ट्रिंग से एक प्रबंधित [String](../../system/string/) बनाता है। |
| static [ReadByte](./readbyte/)(IntPtr, int) | मेमोरी से बाइट पढ़ता है। |
| static [ReadInt16](./readint16/)(IntPtr, int) | मेमोरी से शॉर्ट पढ़ता है। |
| static [ReadInt32](./readint32/)(IntPtr, int) | मेमोरी से इंट पढ़ता है। |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | निर्दिष्ट सुरक्षित स्ट्रिंग की सामग्री को अनमैनेज्ड मेमोरी में कॉपी करता है, ANSI फ़ॉर्मेट में परिवर्तित करता है। |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | निर्दिष्ट सुरक्षित स्ट्रिंग की सामग्री को अनमैनेज्ड मेमोरी में कॉपी करता है। |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | निर्दिष्ट स्ट्रिंग की सामग्री को अनमैनेज्ड मेमोरी में कॉपी करता है। |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | निर्दिष्ट स्ट्रिंग की सामग्री को अनमैनेज्ड मेमोरी में कॉपी करता है, आवश्यक होने पर ANSI फ़ॉर्मेट में परिवर्तित करता है। |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | निर्दिष्ट स्ट्रिंग की सामग्री को अनमैनेज्ड मेमोरी में कॉपी करता है। |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | बाइट को मेमोरी में लिखता है। |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | बाइट को मेमोरी में लिखता है। |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | शॉर्ट को मेमोरी में लिखता है। |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | इंट को मेमोरी में लिखता है। |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | लॉन्ग को मेमोरी में लिखता है। |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | SecureStringToGlobalAllocAnsi मेथड का उपयोग करके आवंटित अनमैनेज्ड स्ट्रिंग पॉइंटर को मुक्त करता है। |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | SecureStringToGlobalAllocUnicode मेथड का उपयोग करके आवंटित अनमैनेज्ड स्ट्रिंग पॉइंटर को मुक्त करता है। |
## संबंधित देखें

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Page for C++](../../)
