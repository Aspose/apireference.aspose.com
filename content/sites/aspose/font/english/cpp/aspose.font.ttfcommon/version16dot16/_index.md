---
title: Aspose::Font::TtfCommon::Version16Dot16 class
linktitle: Version16Dot16
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfCommon::Version16Dot16 class. Reresents Version16Dot16 datatype in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.ttfcommon/version16dot16/
---
## Version16Dot16 class


Reresents [Version16Dot16](./) datatype.

```cpp
class Version16Dot16 : public System::ICloneable
```

## Methods

| Method | Description |
| --- | --- |
| [Clone](./clone/)() override | Create a copy of [Version16Dot16](./) object. |
| [get_MajorNumber](./get_majornumber/)() const | Gets major version number. Value has sense only in hexademical notation, for example version 0.5 for 'maxp' in actual font files is 4 bytes: {0, 0, 80, 0}, what has hexademical representation 0x00005000. After reading this version from font file, Major and minor numbers for object [Version16Dot16](./) will be 0 and 20480 respectively. And these values in hexademical form are 0x0000 and 0x5000. |
| [get_MinorNumber](./get_minornumber/)() const | Gets minor version number Value has sense only in hexademical notation, for example version 0.5 for 'maxp' in actual font files is 4 bytes: {0, 0, 80, 0}, what has hexademical representation 0x00005000. After reading this version from font file, Major and minor numbers for object [Version16Dot16](./) will be 0 and 20480 respectively. And these values in hexademical form are 0x0000 and 0x5000. |
| [get_RawBytes](./get_rawbytes/)() | Gets all raw bits for [Version16Dot16](./) version number as byte array with size 4 bytes. |
| [set_MajorNumber](./set_majornumber/)(uint16_t) | Sets major version number. Value has sense only in hexademical notation, for example version 0.5 for 'maxp' in actual font files is 4 bytes: {0, 0, 80, 0}, what has hexademical representation 0x00005000. After reading this version from font file, Major and minor numbers for object [Version16Dot16](./) will be 0 and 20480 respectively. And these values in hexademical form are 0x0000 and 0x5000. |
| [set_MinorNumber](./set_minornumber/)(uint16_t) | Sets minor version number Value has sense only in hexademical notation, for example version 0.5 for 'maxp' in actual font files is 4 bytes: {0, 0, 80, 0}, what has hexademical representation 0x00005000. After reading this version from font file, Major and minor numbers for object [Version16Dot16](./) will be 0 and 20480 respectively. And these values in hexademical form are 0x0000 and 0x5000. |
| [ToString](./tostring/)() const override | Return version value as a formated string For example "0.5", "1.1", "3.0" etc. |
| [Version16Dot16](./version16dot16/)() | Constructor. |
| [Version16Dot16](./version16dot16/)(uint16_t, uint16_t) | Constructor. |
## See Also

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font::TtfCommon](../)
* Library [Aspose.Font for C++](../../)
