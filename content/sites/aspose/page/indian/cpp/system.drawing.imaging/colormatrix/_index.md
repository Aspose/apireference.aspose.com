---
title: "System::Drawing::Imaging::ColorMatrix class"
linktitle: "ColorMatrix"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Imaging::ColorMatrix class. RGBAW रंग स्थान के निर्देशांक वाले 5x5 मैट्रिक्स का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।"
type: docs
weight: 300
url: /hi/cpp/system.drawing.imaging/colormatrix/
---
## ColorMatrix class


5x5 मैट्रिक्स का प्रतिनिधित्व करता है जो RGBAW रंग स्थान के निर्देशांक रखता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class ColorMatrix : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ColorMatrix](./colormatrix/)() | [ColorMatrix](./) क्लास का नया इंस्टेंस बनाता है और इसे पहचान मैट्रिक्स के मानों से प्रारंभ करता है। |
| [ColorMatrix](./colormatrix/)(const System::ArrayPtr\<System::ArrayPtr\<float\>\>\&) | [ColorMatrix](./) क्लास का नया इंस्टेंस बनाता है और इसे निर्दिष्ट मानों से प्रारंभ करता है। |
| [get_Matrix00](./get_matrix00/)() const | 0‑वीं पंक्ति और 0‑वें स्तंभ में मान लौटाता है। |
| [get_Matrix01](./get_matrix01/)() const | 0‑वीं पंक्ति और 1‑वें स्तंभ में मान लौटाता है। |
| [get_Matrix02](./get_matrix02/)() const | 0‑वीं पंक्ति और 2‑वें स्तंभ में मान लौटाता है। |
| [get_Matrix03](./get_matrix03/)() const | 0‑वीं पंक्ति और 3‑वें स्तंभ में मान लौटाता है। |
| [get_Matrix04](./get_matrix04/)() const | 0‑वीं पंक्ति और 4‑वें स्तंभ में मान लौटाता है। |
| [get_Matrix10](./get_matrix10/)() const | 1‑वीं पंक्ति और 0‑वें स्तंभ में मान लौटाता है। |
| [get_Matrix11](./get_matrix11/)() const | 1‑वीं पंक्ति और 1‑वें स्तंभ में मान लौटाता है। |
| [get_Matrix12](./get_matrix12/)() const | 1‑वीं पंक्ति और 2‑वें स्तंभ में मान लौटाता है। |
| [get_Matrix13](./get_matrix13/)() const | पहली पंक्ति और तीसरे कॉलम में मान लौटाता है। |
| [get_Matrix14](./get_matrix14/)() const | पहली पंक्ति और चौथे कॉलम में मान लौटाता है। |
| [get_Matrix20](./get_matrix20/)() const | दूसरी पंक्ति और शून्यवें कॉलम में मान लौटाता है। |
| [get_Matrix21](./get_matrix21/)() const | दूसरी पंक्ति और पहले कॉलम में मान लौटाता है। |
| [get_Matrix22](./get_matrix22/)() const | दूसरी पंक्ति और दूसरे कॉलम में मान लौटाता है। |
| [get_Matrix23](./get_matrix23/)() const | दूसरी पंक्ति और तीसरे कॉलम में मान लौटाता है। |
| [get_Matrix24](./get_matrix24/)() const | दूसरी पंक्ति और चौथे कॉलम में मान लौटाता है। |
| [get_Matrix30](./get_matrix30/)() const | तीसरी पंक्ति और शून्यवें कॉलम में मान लौटाता है। |
| [get_Matrix31](./get_matrix31/)() const | तीसरी पंक्ति और पहले कॉलम में मान लौटाता है। |
| [get_Matrix32](./get_matrix32/)() const | तीसरी पंक्ति और दूसरे कॉलम में मान लौटाता है। |
| [get_Matrix33](./get_matrix33/)() const | तीसरी पंक्ति और तीसरे कॉलम में मान लौटाता है। |
| [get_Matrix34](./get_matrix34/)() const | तीसरी पंक्ति और चौथे कॉलम में मान लौटाता है। |
| [get_Matrix40](./get_matrix40/)() const | चौथी पंक्ति और शून्यवें कॉलम में मान लौटाता है। |
| [get_Matrix41](./get_matrix41/)() const | चौथी पंक्ति और पहले कॉलम में मान लौटाता है। |
| [get_Matrix42](./get_matrix42/)() const | चौथी पंक्ति और दूसरे कॉलम में मान लौटाता है। |
| [get_Matrix43](./get_matrix43/)() const | चौथी पंक्ति और तीसरे कॉलम में मान लौटाता है। |
| [get_Matrix44](./get_matrix44/)() const | चौथी पंक्ति और चौथे कॉलम में मान लौटाता है। |
| [idx_get](./idx_get/)(int, int) | निर्दिष्ट पंक्ति और कॉलम पर मान लौटाता है। |
| [idx_set](./idx_set/)(int, int, float) | मैट्रिक्स में निर्दिष्ट स्थान पर निर्दिष्ट मान सेट करता है। |
| [set_Matrix00](./set_matrix00/)(float) | शून्यवें पंक्ति और शून्यवें कॉलम में मान सेट करता है। |
| [set_Matrix01](./set_matrix01/)(float) | शून्यवें पंक्ति और पहले कॉलम में मान सेट करता है। |
| [set_Matrix02](./set_matrix02/)(float) | शून्यवें पंक्ति और दूसरे कॉलम में मान सेट करता है। |
| [set_Matrix03](./set_matrix03/)(float) | शून्यवें पंक्ति और तीसरे कॉलम में मान सेट करता है। |
| [set_Matrix04](./set_matrix04/)(float) | शून्यवें पंक्ति और चौथे कॉलम में मान सेट करता है। |
| [set_Matrix10](./set_matrix10/)(float) | पहली पंक्ति और शून्यवें कॉलम में मान सेट करता है। |
| [set_Matrix11](./set_matrix11/)(float) | 1‑st पंक्ति और 1‑st कॉलम में मान सेट करता है। |
| [set_Matrix12](./set_matrix12/)(float) | 1‑st पंक्ति और 2‑nd कॉलम में मान सेट करता है। |
| [set_Matrix13](./set_matrix13/)(float) | 1‑st पंक्ति और 3‑rd कॉलम में मान सेट करता है। |
| [set_Matrix14](./set_matrix14/)(float) | 1‑st पंक्ति और 4‑th कॉलम में मान सेट करता है। |
| [set_Matrix20](./set_matrix20/)(float) | 2‑nd पंक्ति और 0‑th कॉलम में मान सेट करता है। |
| [set_Matrix21](./set_matrix21/)(float) | 2‑nd पंक्ति और 1‑st कॉलम में मान सेट करता है। |
| [set_Matrix22](./set_matrix22/)(float) | 2‑nd पंक्ति और 2‑nd कॉलम में मान सेट करता है। |
| [set_Matrix23](./set_matrix23/)(float) | 2‑nd पंक्ति और 3‑rd कॉलम में मान सेट करता है। |
| [set_Matrix24](./set_matrix24/)(float) | 2‑nd पंक्ति और 4‑th कॉलम में मान सेट करता है। |
| [set_Matrix30](./set_matrix30/)(float) | 3‑rd पंक्ति और 0‑th कॉलम में मान सेट करता है। |
| [set_Matrix31](./set_matrix31/)(float) | 3‑rd पंक्ति और 1‑st कॉलम में मान सेट करता है। |
| [set_Matrix32](./set_matrix32/)(float) | 3‑rd पंक्ति और 2‑nd कॉलम में मान सेट करता है। |
| [set_Matrix33](./set_matrix33/)(float) | 3‑rd पंक्ति और 3‑rd कॉलम में मान सेट करता है। |
| [set_Matrix34](./set_matrix34/)(float) | 3‑rd पंक्ति और 4‑th कॉलम में मान सेट करता है। |
| [set_Matrix40](./set_matrix40/)(float) | 4‑th पंक्ति और 0‑th कॉलम में मान सेट करता है। |
| [set_Matrix41](./set_matrix41/)(float) | 4‑th पंक्ति और 1‑st कॉलम में मान सेट करता है। |
| [set_Matrix42](./set_matrix42/)(float) | 4‑th पंक्ति और 2‑nd कॉलम में मान सेट करता है। |
| [set_Matrix43](./set_matrix43/)(float) | 4‑th पंक्ति और 3‑rd कॉलम में मान सेट करता है। |
| [set_Matrix44](./set_matrix44/)(float) | 4‑th पंक्ति और 4‑th कॉलम में मान सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
