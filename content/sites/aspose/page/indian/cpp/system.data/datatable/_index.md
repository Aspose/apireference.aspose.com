---
title: "System::Data::DataTable class"
linktitle: "DataTable"
second_title: "Aspose.Page C++ के लिए"
description: "System::Data::DataTable class. डेटा पंक्तियों और कॉलमों में संरचित है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 900
url: /hi/cpp/system.data/datatable/
---
## DataTable class


[Data](../) structured in rows and columns. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DataTable : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Columns](./get_columns/)() | टेबल में मौजूद कॉलम प्राप्त करता है। |
| [get_DataSet](./get_dataset/)() | टेबल जिस डेटा सेट से संबंधित है उसे प्राप्त करता है। |
| [get_Rows](./get_rows/)() | RTTI जानकारी। |
| [get_TableName](./get_tablename/)() | टेबल का नाम प्राप्त करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
