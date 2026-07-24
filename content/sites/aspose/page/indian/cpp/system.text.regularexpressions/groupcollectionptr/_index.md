---
title: "System::Text::RegularExpressions::GroupCollectionPtr class"
linktitle: "GroupCollectionPtr"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::RegularExpressions::GroupCollectionPtr क्लास। समूह संग्रह पॉइंटर। यह प्रकार अन्य वस्तुओं की हटाने को प्रबंधित करने के लिए एक पॉइंटर है। इसे स्टैक पर आवंटित किया जाना चाहिए और C++ में फ़ंक्शनों को मान द्वारा या const रेफ़रेंस द्वारा पास किया जाना चाहिए।"
type: docs
weight: 500
url: /hi/cpp/system.text.regularexpressions/groupcollectionptr/
---
## GroupCollectionPtr class


[Group](../group/) collection pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
class GroupCollectionPtr : public System::SmartPtr<GroupCollection>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [GroupCollectionPtr](./groupcollectionptr/)() | नल पॉइंटर कंस्ट्रक्टर। |
| [GroupCollectionPtr](./groupcollectionptr/)(const SharedPtr\<GroupCollection\>\&) | टाइप रूपांतरण कंस्ट्रक्टर। |
| [operator[]](./operator[]/)(size_t) const | [Group](../group/) एक्सेसर। |
## संबंधित देखें

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
