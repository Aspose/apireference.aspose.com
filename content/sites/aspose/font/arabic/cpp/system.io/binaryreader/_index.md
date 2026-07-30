---
title: "System::IO::BinaryReader فئة"
linktitle: "BinaryReader"
second_title: "Aspose.Font لـ C++"
description: "فئة System::IO::BinaryReader. تمثل قارئًا يقرأ الأنواع الأولية كبيانات ثنائية بترميز معين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أعطال التأكيد. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system.io/binaryreader/
---
## BinaryReader class


تمثل قارئًا يقرأ الأنواع الأولية كبيانات ثنائية بترميز معين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أعطال التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class BinaryReader : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&) | ينشئ نسخة من فئة [BinaryReader](./) التي تقرأ البيانات من الدفق المحدد باستخدام ترميز UTF-8. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | ينشئ نسخة من فئة [BinaryReader](./) التي تقرأ البيانات من الدفق المحدد باستخدام الترميز المحدد. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) | ينشئ نسخة من فئة [BinaryReader](./) التي تقرأ البيانات من الدفق المحدد باستخدام الترميز المحدد. |
| virtual [Close](./close/)() | يغلق كائن [BinaryReader](./) الحالي وتدفق الإدخال الأساسي. |
| [Dispose](./dispose/)() override | يحرر جميع الموارد المستخدمة بواسطة الكائن الحالي ويغلق الدفق الأساسي. |
| virtual [get_BaseStream](./get_basestream/)() | يعيد تدفق الإدخال. |
| virtual [PeekChar](./peekchar/)() | يقرأ حرفًا واحدًا من تدفق الإدخال دون تغيير مؤشر القراءة في التدفق. |
| virtual [Read](./read/)() | يقرأ حرفًا واحدًا من تدفق الإدخال. |
| virtual [Read](./read/)(ArrayPtr\<uint8_t\>, int, int) | يقرأ عدد البايتات المحدد من تدفق الإدخال ويكتبها إلى مصفوفة البايتات المحددة. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | يقرأ عدد الأحرف المحدد من تدفق الإدخال، يحولها إلى ترميز UTF-16 ويكتب الأحرف الناتجة بترميز UTF-16 إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد. |
| virtual [ReadBoolean](./readboolean/)() | يقرأ بايتًا واحدًا من تدفق الإدخال ويعيد تمثيله المنطقي. |
| virtual [ReadByte](./readbyte/)() | يقرأ بايتًا واحدًا من تدفق الإدخال. |
| virtual [ReadBytes](./readbytes/)(int) | يقرأ عدد البايتات المحدد من تدفق الإدخال. |
| virtual [ReadChar](./readchar/)() | يقرأ حرفًا واحدًا من تدفق الإدخال. |
| virtual [ReadChars](./readchars/)(int) | يقرأ عدد الأحرف المحدد من تدفق الإدخال ويعيدها بترميز UTF-16. |
| virtual [ReadDecimal](./readdecimal/)() | غير مُنفّذ. |
| virtual [ReadDouble](./readdouble/)() | يقرأ 8 بايتات من تدفق الإدخال ويعيدها كقيمة نقطية ذات دقة مزدوجة. |
| virtual [ReadInt16](./readint16/)() | يقرأ 2 بايت من تدفق الإدخال ويعيدها كقيمة عدد صحيح 16-بت. |
| virtual [ReadInt32](./readint32/)() | يقرأ 4 بايتات من تدفق الإدخال ويعيدها كقيمة عدد صحيح 32-بت. |
| virtual [ReadInt64](./readint64/)() | يقرأ 8 بايتات من تدفق الإدخال ويعيدها كقيمة عدد صحيح 64-بت. |
| virtual [ReadSByte](./readsbyte/)() | يقرأ بايتًا واحدًا من تدفق الإدخال ويعيده كقيمة عدد صحيح موقّع 8-بت. |
| virtual [ReadSingle](./readsingle/)() | يقرأ 4 بايتات من تدفق الإدخال ويعيدها كقيمة نقطية ذات دقة أحادية. |
| virtual [ReadString](./readstring/)() | يقرأ سلسلة نصية من الدفق الحالي. تُسبق السلسلة بطولها، مُشفَّرة كعدد صحيح بسبعة بتات في كل مرة. |
| virtual [ReadUInt16](./readuint16/)() | يقرأ 2 بايت من دفق الإدخال ويعيدهما كقيمة عدد صحيح غير موقع 16‑بت. |
| virtual [ReadUInt32](./readuint32/)() | يقرأ 4 بايت من دفق الإدخال ويعيدها كقيمة عدد صحيح غير موقع 32‑بت. |
| virtual [ReadUInt64](./readuint64/)() | يقرأ 8 بايت من دفق الإدخال ويعيدها كقيمة عدد صحيح غير موقع 64‑بت. |
| virtual [~BinaryReader](./~binaryreader/)() | المدمر. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
