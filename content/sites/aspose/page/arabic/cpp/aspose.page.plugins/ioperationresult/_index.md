---
title: "الفئة Aspose::Page::Plugins::IOperationResult"
linktitle: "IOperationResult"
second_title: "Aspose.Page لـ C++"
description: "الفئة Aspose::Page::Plugins::IOperationResult. واجهة نتيجة عملية عامة تُعرّف الأساليب المشتركة التي يجب على نتيجة عملية المكوّن الإضافي المحدد تنفيذها في C++."
type: docs
weight: 700
url: /ar/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


واجهة نتيجة العملية العامة التي تحدد الأساليب المشتركة التي يجب أن تنفذها نتيجة عملية الملحق الفعلية.

```cpp
class IOperationResult : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_Data](./get_data/)() | يحصل على البيانات الخام. |
| virtual [get_IsByteArray](./get_isbytearray/)() | يشير إلى ما إذا كانت النتيجة مصفوفة بايت. |
| virtual [get_IsFile](./get_isfile/)() | يشير إلى ما إذا كانت النتيجة مسارًا لملف إخراج. |
| virtual [get_IsStream](./get_isstream/)() | يشير إلى ما إذا كانت النتيجة تدفق إخراج. |
| virtual [get_IsString](./get_isstring/)() | يشير إلى ما إذا كانت النتيجة سلسلة نصية. |
| virtual [ToFile](./tofile/)() | يحاول تحويل النتيجة إلى الملف. |
| virtual [ToStream](./tostream/)() | يحاول تحويل النتيجة إلى كائن الدفق. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
