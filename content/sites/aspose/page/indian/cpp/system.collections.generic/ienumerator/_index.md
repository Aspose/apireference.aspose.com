---
title: "System::Collections::Generic::IEnumerator क्लास"
linktitle: "IEnumerator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::IEnumerator क्लास। कुछ तत्वों के माध्यम से इटररेट करने के लिए उपयोग किया जा सकने वाले एन्यूमरेटर का इंटरफ़ेस। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 2300
url: /hi/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


एन्यूमरेटर का इंटरफ़ेस जो कुछ तत्वों के माध्यम से इटरेट करने के लिए उपयोग किया जा सकता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | VirtualizedIterator क्लास द्वारा उपयोग किए जाने वाले इटररेटर को तैयार करता है। |
| [CloneIterator](./cloneiterator/)() const override | वर्तमान इटरेटर की क्लोन बनाता है। |
| virtual [Current](./current/)() const | वर्तमान तत्व प्राप्त करता है। |
| virtual [get_Current](./get_current/)() const | वर्तमान तत्व प्राप्त करता है। |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | इटररेटर को एक कदम आगे ले जाता है। |
| [InitializeIterator](./initializeiterator/)() override | पहला [MoveNext()](./movenext/) कॉल करता है और एन्यूमरेटर ऑब्जेक्ट को VirtualizedIterator द्वारा उपयोग के लिए तैयार करता है। |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | वर्चुअलाइज़्ड इटररेटर द्वारा स्वामित्व वाले एन्यूमरेटर को चिह्नित करता है। |
| virtual [MoveNext](./movenext/)() | एनेमरेटर को अगले तत्व पर ले जाता है। यदि पहले कोई तत्व संदर्भित नहीं था, तो उपलब्ध पहले तत्व को संदर्भित करता है। यदि कंटेनर के अंत तक पहुँचा गया, तो कुछ नहीं करता। |
| virtual [Reset](./reset/)() | एन्यूमरेटर को पहले तत्व से पहले की स्थिति पर रीसेट करता है। |
| virtual [~IEnumerator](./~ienumerator/)() |  |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [ValueType](./valuetype/) | वैल्यू टाइप। |
## टिप्पणियाँ



```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // List-क्लास का इंस्टेंस बनाएं।
  auto collection = MakeObject<List<int>>();

  // सूची को भरें।
  collection->Add(1);
  collection->Add(2);
  collection->Add(3);

  // सूची का इटेरेटर प्राप्त करें।
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // वर्तमान तत्व प्राप्त करें और उसे प्रिंट करें।
    std::cout << enumerator->get_Current() << ' ';
  }

  // इटेरेटर को रीसेट करें।
  enumerator->Reset();

  return 0;
}
/*
This code example produces the following output:
1 2 3
*/
```

## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
