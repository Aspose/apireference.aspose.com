---
title: "System::Collections::Generic::LinkedList क्लास"
linktitle: "LinkedList"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::LinkedList क्लास। C++ में LinkedList की फॉरवर्ड डिक्लेरेशन।"
type: docs
weight: 3100
url: /hi/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| पैरामीटर | विवरण |
| --- | --- |
| T | समाहित मान प्रकार। |
## Nested classes

* Class [Enumerator](./enumerator/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const T\&) override | सूची के अंत में **element** जोड़ता है। |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | सूची के **node** के बाद **element** जोड़ता है। |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | सूची के **node** के बाद **newNode** जोड़ता है। |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | सूची के **node** से पहले **element** जोड़ता है। |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | सूची के **node** से पहले **newNode** जोड़ता है। |
| [AddFirst](./addfirst/)(const T\&) | सूची की शुरुआत में **element** जोड़ता है। |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | सूची की शुरुआत में **newNode** जोड़ता है। |
| [AddLast](./addlast/)(const T\&) | सूची के अंत में **element** जोड़ता है। |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | सूची के अंत में **newNode** जोड़ता है। |
| [begin](./begin/)() | संग्रह के पहले तत्व के लिए इटररेटर प्राप्त करता है। |
| [begin](./begin/)() const | स्थिर-योग्य संग्रह के पहले तत्व के लिए इटररेटर प्राप्त करता है। |
| [cbegin](./cbegin/)() const | संग्रह के पहले const-योग्य तत्व के लिए इटररेटर प्राप्त करता है। |
| [cend](./cend/)() const | संग्रह के अंत के पीछे मौजूद न होने वाले const-योग्य तत्व के लिए इटररेटर प्राप्त करता है। |
| [Clear](./clear/)() override | सूची में सभी तत्वों को हटाता है। |
| [Contains](./contains/)(const T\&) const override | जाँचता है कि **element** सूची में मौजूद है या नहीं। |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | कंटेनर डेटा को मौजूदा एरे तत्वों में कॉपी करता है। |
| [crbegin](./crbegin/)() const | संग्रह के अंतिम const-योग्य तत्व के लिए एक रिवर्स इटरेटर प्राप्त करता है (रिवर्स में पहला)। |
| [crend](./crend/)() const | संग्रह की शुरुआत से पहले एक गैर-मौजूद const-योग्य तत्व के लिए रिवर्स इटरेटर प्राप्त करता है। |
| [end](./end/)() | संग्रह के अंत के पीछे मौजूद न होने वाले तत्व के लिए इटररेटर प्राप्त करता है। |
| [end](./end/)() const | const-योग्य संग्रह के अंत के पीछे मौजूद न होने वाले तत्व के लिए इटररेटर प्राप्त करता है। |
| [Find](./find/)(const T\&) const | सूची में **element** की आगे की दिशा में खोज करता है। |
| [FindLast](./findlast/)(const T\&) const | सूची में **element** की उल्टी दिशा में खोज करता है। |
| [get_Count](./get_count/)() const override | सूची में तत्वों की संख्या प्राप्त करता है। |
| [get_First](./get_first/)() const | सूची में पहले तत्व का पॉइंटर प्राप्त करता है। |
| [get_Last](./get_last/)() const | सूची में अंतिम तत्व का पॉइंटर प्राप्त करता है। |
| [GetEnumerator](./getenumerator/)() override | वर्तमान [LinkedList](./) के माध्यम से इटरेट करने के लिए इनेमरेटर प्राप्त करता है। |
| [LinkedList](./linkedlist/)() | खाली [LinkedList](./) बनाता है। |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | कॉपी कंस्ट्रक्टर। |
| [rbegin](./rbegin/)() | कलेक्शन के अंतिम तत्व (रिवर्स में पहला) के लिए एक रिवर्स इटररेटर प्राप्त करता है। |
| [rbegin](./rbegin/)() const | कॉन्स्ट-योग्य कलेक्शन के अंतिम तत्व (रिवर्स में पहला) के लिए एक रिवर्स इटररेटर प्राप्त करता है। |
| [Remove](./remove/)(const T\&) override | सूची से निर्दिष्ट **element** की पहली उपस्थिति को हटाता है। |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | सूची से नोड को हटाता है। |
| [RemoveFirst](./removefirst/)() | सूची से पहला नोड हटाता है। |
| [RemoveLast](./removelast/)() | सूची से अंतिम नोड हटाता है। |
| [rend](./rend/)() | कलेक्शन की शुरुआत से पहले एक गैर-मौजूद तत्व के लिए रिवर्स इटररेटर प्राप्त करता है। |
| [rend](./rend/)() const | कॉन्स्ट-योग्य कलेक्शन की शुरुआत से पहले एक गैर-मौजूद तत्व के लिए रिवर्स इटररेटर प्राप्त करता है। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [const_iterator](./const_iterator/) | कॉन्स्ट इटररेटर प्रकार। |
| [const_reverse_iterator](./const_reverse_iterator/) | कॉन्स्ट रिवर्स इटररेटर प्रकार। |
| [iterator](./iterator/) | इटररेटर प्रकार। |
| [list_t](./list_t/) | अधोस्थ डेटा प्रकार। |
| [reverse_iterator](./reverse_iterator/) | रिवर्स इटररेटर प्रकार। |
## टिप्पणियाँ


Linked list कंटेनर। std::list के ऊपर एक रैपर लागू करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन में तर्क के रूप में पास करने के लिए करें।


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // LinkedList क्लास का एक इंस्टेंस बनाएँ।
  auto list = MakeObject<LinkedList<int>>();

  // Linked list को भरें।
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // Linked list आइटम्स को प्रिंट करें।
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## संबंधित देखें

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
