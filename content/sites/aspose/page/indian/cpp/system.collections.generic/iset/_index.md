---
title: "System::Collections::Generic::ISet क्लास"
linktitle: "ISet"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::ISet क्लास। अद्वितीय तत्वों के सेट को समाहित करने वाले संग्रह का इंटरफ़ेस। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 2700
url: /hi/cpp/system.collections.generic/iset/
---
## ISet class


अद्वितीय तत्वों के सेट को समाहित करने वाले संग्रह का इंटरफ़ेस। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | तत्वों के समूह को हटाता है। |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | विभिन्न कंटेनर में न मौजूद तत्वों को हटाता है। |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | जाँचता है कि वर्तमान सेट अन्य कंटेनर का सख्त उपसमुच्चय है या नहीं। |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | जाँचता है कि वर्तमान सेट अन्य कंटेनर का सख्त अधिसमुच्चय है या नहीं। |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | जाँचता है कि वर्तमान सेट अन्य कंटेनर का उपसमुच्चय है या नहीं। |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | जाँचता है कि वर्तमान सेट अन्य कंटेनर का अधिसमुच्चय है या नहीं। |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | जाँचता है कि सेट अन्य कंटेनर के साथ ओवरलैप करता है या नहीं। |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | जाँचता है कि सेट और कंटेनर में समान तत्व हैं या नहीं। |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | दो कंटेनरों का सममित अपवर्जन गणना करता है। दोनों कंटेनरों में मौजूद सभी तत्वों को हटाता है, लेकिन साथ ही **other** में मौजूद लेकिन वर्तमान सेट में न होने वाले सभी तत्वों को जोड़ता है। |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | निर्दिष्ट संग्रह से उन तत्वों को जोड़ता है जो अभी तक वर्तमान सेट में मौजूद नहीं हैं। |
| virtual [~ISet](./~iset/)() | डिस्ट्रक्टर। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | RTTI जानकारी। |

## संबंधित देखें

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
