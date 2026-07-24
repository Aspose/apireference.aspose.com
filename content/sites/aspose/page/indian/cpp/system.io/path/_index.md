---
title: "System::IO::Path क्लास"
linktitle: "Path"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Path क्लास। पाथ्स को संशोधित करने के लिए मेथड्स प्रदान करता है। यह एक स्थैतिक प्रकार है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको C++ में किसी भी तरह इसका इंस्टेंस नहीं बनाना चाहिए।"
type: docs
weight: 1900
url: /hi/cpp/system.io/path/
---
## Path class


पाथ को संशोधित करने के लिए विधियाँ प्रदान करता है। यह एक स्थैतिक प्रकार है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। इसे किसी भी माध्यम से कभी भी इंस्टेंस नहीं बनाना चाहिए।

```cpp
class Path
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [ChangeExtension](./changeextension/)(const String\&, const String\&) | निर्दिष्ट फ़ाइल पाथ में एक्सटेंशन बदलता है। |
| static [CheckPath](./checkpath/)(const String\&, const String\&, bool) | निर्दिष्ट पाथ को अवैध अक्षरों की उपस्थिति की जाँच करके वैधता निर्धारित करता है। यदि पाथ में अवैध अक्षर होते हैं तो एक अपवाद फेंका जाता है। |
| static [Combine](./combine/)(const ArrayPtr\<String\>\&) | निर्दिष्ट पाथ सेगमेंट्स को एकल पाथ में मिलाता है, आवश्यक होने पर सेगमेंट्स के बीच डायरेक्टरी सेपरेटर अक्षर डालता है। |
| static [Combine](./combine/)(const String\&, const String\&) | दो निर्दिष्ट पाथ सेगमेंट्स को एकल पाथ में मिलाता है, आवश्यक होने पर सेगमेंट्स के बीच डायरेक्टरी सेपरेटर अक्षर डालता है। |
| static [Combine](./combine/)(const String\&, const String\&, const String\&) | तीन निर्दिष्ट पाथ सेगमेंट्स को एकल पाथ में मिलाता है, आवश्यक होने पर सेगमेंट्स के बीच डायरेक्टरी सेपरेटर अक्षर डालता है। |
| static [Combine](./combine/)(const String\&, const String\&, const String\&, const String\&) | चार निर्दिष्ट पाथ सेगमेंट्स को एकल पाथ में मिलाता है, आवश्यक होने पर सेगमेंट्स के बीच डायरेक्टरी सेपरेटर अक्षर डालता है। |
| static [GetDirectoryName](./getdirectoryname/)(const String\&) | निर्दिष्ट पाथ द्वारा संदर्भित डायरेक्टरी का नाम लौटाता है। |
| static [GetExtension](./getextension/)(const String\&) | निर्दिष्ट पाथ द्वारा संदर्भित फ़ाइल का एक्सटेंशन लौटाता है। |
| static [GetFileName](./getfilename/)(const String\&) | निर्दिष्ट पाथ द्वारा संदर्भित फ़ाइल का नाम लौटाता है। |
| static [GetFileNameWithoutExtension](./getfilenamewithoutextension/)(const String\&) | निर्दिष्ट पाथ द्वारा संदर्भित फ़ाइल का नाम (बिना एक्सटेंशन के) लौटाता है। |
| static [GetFullPath](./getfullpath/)(const String\&) | निर्दिष्ट पाथ को पूर्ण पाथ में परिवर्तित करता है। |
| static [GetInvalidFileNameChars](./getinvalidfilenamechars/)() | फ़ाइल नामों में अनुमति न होने वाले अक्षरों को शामिल करने वाला एरे लौटाता है। |
| static [GetInvalidPathChars](./getinvalidpathchars/)() | पाथ नामों में अनुमति नहीं वाले अक्षरों को शामिल करने वाला एक एरे लौटाता है। |
| static [GetPathRoot](./getpathroot/)(const String\&) | निर्दिष्ट पथ की रूट डायरेक्टरी लौटाता है। |
| static [GetRandomFileName](./getrandomfilename/)() | एक यादृच्छिक रूप से उत्पन्न फ़ाइल नाम लौटाता है। |
| static [GetTempFileName_](./gettempfilename_/)() | एक अनूठे नाम वाली नई फ़ाइल बनाता है और उसका पूर्ण पाथ लौटाता है। |
| static [GetTempFileNameSafe](./gettempfilenamesafe/)() | एक अनूठे नाम वाली नई फ़ाइल बनाता है और उसका पूर्ण पाथ लौटाता है। यह [GetTempFileName_()](./gettempfilename_/) मेथड का समानार्थी है। |
| static [GetTempPath](./gettemppath/)() | वर्तमान उपयोगकर्ता की अस्थायी डायरेक्टरी का पाथ लौटाता है। |
| static [HasExtension](./hasextension/)(const String\&) | निर्धारित करता है कि निर्दिष्ट पाथ किसी फ़ाइल के एक्सटेंशन को संदर्भित करता है या नहीं। |
| static [IsPathRooted](./ispathrooted/)(const String\&) | निर्धारित करता है कि निर्दिष्ट पाथ में रूट मौजूद है या नहीं। |
| static [NormalizePath](./normalizepath/)(const String\&) | निर्दिष्ट पाथ को सामान्यीकृत करता है। |
| static [ToBoost](./toboost/)(const String\&) | निर्दिष्ट पाथ को दर्शाने वाली boost::filesystem::path क्लास का एक इंस्टेंस लौटाता है। |
| static [ToString](./tostring/)(const boost::filesystem::path\&) | निर्दिष्ट Boost के पाथ ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [AltDirectorySeparatorChar](./altdirectoryseparatorchar/) | पाथ में डायरेक्टरी स्तरों को अलग करने के लिए उपयोग किया जाने वाला वैकल्पिक अक्षर। |
| static [DirectorySeparatorChar](./directoryseparatorchar/) | पाथ में डायरेक्टरी स्तरों को अलग करने के लिए उपयोग किया जाने वाला अक्षर। |
| static [PathSeparator](./pathseparator/) | पर्यावरण वेरिएबल्स में पाथ स्ट्रिंग्स को अलग करने के लिए उपयोग किया जाने वाला विभाजक अक्षर। |
| static [VolumeSeparatorChar](./volumeseparatorchar/) | वॉल्यूम विभाजक अक्षर। |
## टिप्पणियाँ



```cpp
#include "system/io/path.h"
#include <iostream>

int main()
{
  using namespace System::IO;

  // एक यादृच्छिक फ़ाइलनाम उत्पन्न करें।
  auto filename = Path::GetRandomFileName();

  // फ़ाइलनाम के बारे में जानकारी प्रिंट करें।
  std::cout <<
    "Filename: " << Path::GetFileName(filename) << std::endl <<
    "Filename w/o an extension: " << Path::GetFileNameWithoutExtension(filename) << std::endl <<
    "Extension: " << Path::GetExtension(filename) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Filename: qhuzkyqv.y6p
Filename w/o an extension: qhuzkyqv
Extension: .y6p
*/
```

## संबंधित देखें

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
