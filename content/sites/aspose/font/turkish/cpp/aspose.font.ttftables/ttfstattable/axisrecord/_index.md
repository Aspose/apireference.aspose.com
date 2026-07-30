---
title: "Aspose::Font::TtfTables::TtfStatTable::AxisRecord sınıfı"
linktitle: "AxisRecord"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfStatTable::AxisRecord sınıfı. Axis Record yapısını temsil eder. Spec: eksen kaydı C++'da tek bir tasarım ekseni hakkında bilgi sağlar."
type: docs
weight: 1300
url: /tr/cpp/aspose.font.ttftables/ttfstattable/axisrecord/
---
## AxisRecord class


Axis Record yapısını temsil eder. Spec: eksen kaydı tek bir tasarım ekseni hakkında bilgi sağlar.

```cpp
class AxisRecord : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AxisRecord](./axisrecord/)(System::String, uint16_t, uint16_t) | Yapıcı. |
| [get_AxisNameId](./get_axisnameid/)() const | axisNameID alanını döndürür. Spec: axisNameID alanı, uygulama kullanıcı arayüzlerinde eksene referans vermek için 'name' tablosundan dizeler elde etmek amacıyla kullanılabilecek bir ad kimliği sağlar. |
| [get_AxisOrdering](./get_axisordering/)() const | axisOrdering alanını döndürür. Spec: Uygulamaların yüz adı sıralamasını belirlemek veya aile ya da yüz adları oluştururken etiketlerin sırasını belirlemek için kullanabileceği bir değer. |
| [get_Tag](./get_tag/)() const | Tasarım varyasyonu eksenini tanımlayan bir etiketi döndürür. Spec: Her eksen kaydı, ekseni belirten bir etikete sahiptir. Etiket değerleri, OpenType Design-Variation Axis Tag Registry'de açıklanan eksen etiketi kurallarına uymalıdır. |
## Ayrıca Bakınız

* Class [Object](../../../system/object/)
* Class [TtfStatTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
