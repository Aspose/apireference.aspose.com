---
title: "System::IO::BinaryReader فئة"
linktitle: "BinaryReader"
second_title: "Aspose.Page لـ C++"
description: "System::IO::BinaryReader فئة. تمثل قارئًا يقرأ الأنواع الأولية للبيانات كبيانات ثنائية بترميز معين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system.io/binaryreader/
---
## BinaryReader class


يمثل قارئًا يقرأ الأنواع الأولية للبيانات كبيانات ثنائية بترميز معين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class BinaryReader : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&) | ينشئ نسخة من فئة [BinaryReader](./) التي تقرأ البيانات من الدفق المحدد باستخدام ترميز UTF-8. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | ينشئ نسخة من فئة [BinaryReader](./) التي تقرأ البيانات من الدفق المحدد باستخدام الترميز المحدد. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) | ينشئ نسخة من فئة [BinaryReader](./) التي تقرأ البيانات من الدفق المحدد باستخدام الترميز المحدد. |
| virtual [Close](./close/)() | يغلق كائن [BinaryReader](./) الحالي والدفق الإدخالي الأساسي. |
| [Dispose](./dispose/)() override | يحرر جميع الموارد المستخدمة بواسطة الكائن الحالي ويغلق الدفق الأساسي. |
| virtual [get_BaseStream](./get_basestream/)() | يعيد الدفق الإدخالي. |
| virtual [PeekChar](./peekchar/)() | يقرأ حرفًا واحدًا من الدفق الإدخالي دون تغيير مؤشر القراءة في الدفق. |
| virtual [Read](./read/)() | يقرأ حرفًا واحدًا من الدفق الإدخالي. |
| virtual [Read](./read/)(ArrayPtr\<uint8_t\>, int, int) | يقرأ العدد المحدد من البايتات من الدفق الإدخالي ويكتبها إلى مصفوفة البايتات المحددة. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | يقرأ العدد المحدد من الأحرف من الدفق الإدخالي، يحولها إلى ترميز UTF-16 ويكتب الأحرف الناتجة بترميز UTF-16 إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد. |
| virtual [ReadBoolean](./readboolean/)() | يقرأ بايتًا واحدًا من الدفق الإدخالي ويعيد تمثيله المنطقي. |
| virtual [ReadByte](./readbyte/)() | يقرأ بايتًا واحدًا من الدفق الإدخالي. |
| virtual [ReadBytes](./readbytes/)(int) | يقرأ العدد المحدد من البايتات من الدفق الإدخالي. |
| virtual [ReadChar](./readchar/)() | يقرأ حرفًا واحدًا من الدفق الإدخالي. |
| virtual [ReadChars](./readchars/)(int) | يقرأ العدد المحدد من الأحرف من الدفق الإدخالي ويعيدها بترميز UTF-16. |
| virtual [ReadDecimal](./readdecimal/)() | غير مُنفَّذ. |
| virtual [ReadDouble](./readdouble/)() | يقرأ 8 بايتات من الدفق الإدخالي ويعيدها كقيمة نقطية ذات دقة مزدوجة. |
| virtual [ReadInt16](./readint16/)() | يقرأ 2 بايت من الدفق الإدخالي ويعيدها كقيمة عدد صحيح 16-بت. |
| virtual [ReadInt32](./readint32/)() | يقرأ 4 بايت من تدفق الإدخال ويعيدها كقيمة عدد صحيح 32‑بت. |
| virtual [ReadInt64](./readint64/)() | يقرأ 8 بايت من تدفق الإدخال ويعيدها كقيمة عدد صحيح 64‑بت. |
| virtual [ReadSByte](./readsbyte/)() | يقرأ بايتًا واحدًا من تدفق الإدخال ويعيده كقيمة عدد صحيح موقع 8‑بت. |
| virtual [ReadSingle](./readsingle/)() | يقرأ 4 بايت من تدفق الإدخال ويعيدها كقيمة عدد عشري بنقطة عائمة ذات دقة مفردة. |
| virtual [ReadString](./readstring/)() | يقرأ سلسلة نصية من التدفق الحالي. تُسبق السلسلة بطولها، مُشفرة كعدد صحيح سبعة بتات في كل مرة. |
| virtual [ReadUInt16](./readuint16/)() | يقرأ 2 بايت من تدفق الإدخال ويعيدها كقيمة عدد صحيح غير موقع 16‑بت. |
| virtual [ReadUInt32](./readuint32/)() | يقرأ 4 بايت من تدفق الإدخال ويعيدها كقيمة عدد صحيح غير موقع 32‑بت. |
| virtual [ReadUInt64](./readuint64/)() | يقرأ 8 بايت من تدفق الإدخال ويعيدها كقيمة عدد صحيح غير موقع 64‑بت. |
| virtual [~BinaryReader](./~binaryreader/)() | المدمر. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
