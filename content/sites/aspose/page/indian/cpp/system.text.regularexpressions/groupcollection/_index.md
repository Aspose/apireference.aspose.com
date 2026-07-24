---
title: "System::Text::RegularExpressions::GroupCollection क्लास"
linktitle: "GroupCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::RegularExpressions::GroupCollection क्लास। एकल मैच में कैप्चर समूहों की सूची। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 400
url: /hi/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


एकल मैच में कैप्चर समूहों की सूची। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | संग्रह में तत्व जोड़ने को निष्क्रिय करता है। |
| [AddGroup](./addgroup/)(const GroupPtr\&) | संग्रह में समूह जोड़ता है। |
| [Clear](./clear/)() override | संग्रह से तत्व हटाने को निष्क्रिय करता है। |
| [get_Item](./get_item/)(int) const | [Group](../group/) एक्सेसर। |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) एक्सेसर। |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | निर्माता। |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) एक्सेसर। |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) एक्सेसर। |
| [IsReadOnly](./isreadonly/)() const | संग्रह को केवल‑पढ़ने योग्य चिह्नित करता है। |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) एक्सेसर। |
| [operator[]](./operator[]/)(int) | [Group](../group/) एक्सेसर। |
| [operator[]](./operator[]/)(int) const | [Group](../group/) एक्सेसर। |
| [Remove](./remove/)(const GroupPtr\&) override | संग्रह से तत्व को हटाने को निष्क्रिय करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Base](./base/) | [Base](./base/) क्लास। |
## संबंधित देखें

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
