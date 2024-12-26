---
title: Aspose::Font::Ttf::TtfEncodingParameters class
linktitle: TtfEncodingParameters
second_title: Aspose.Font for C++
description: 'Aspose::Font::Ttf::TtfEncodingParameters class. Represents TTF encoding parameters in C++.'
type: docs
weight: 500
url: /cpp/aspose.font.ttf/ttfencodingparameters/
---
## TtfEncodingParameters class


Represents TTF encoding parameters.

```cpp
class TtfEncodingParameters : public Aspose::Font::IEncodingParameters
```

## Methods

| Method | Description |
| --- | --- |
| [get_PlatformId](./get_platformid/)() const | Gets PlatformId value. |
| [get_PlatformSpecificId](./get_platformspecificid/)() const | Gets PlatformSpecificId value. |
| [set_PlatformId](./set_platformid/)(uint16_t) | Sets PlatformId value. |
| [set_PlatformSpecificId](./set_platformspecificid/)(uint16_t) | Sets PlatformSpecificId value. |
| [TtfEncodingParameters](./ttfencodingparameters/)(uint16_t, uint16_t) | Initializes new instance of [TtfEncodingParameters](./) class. Takes Platform Id, Platform-specific encoding id as parameters. These parameters used to request special CMap subtable from main font CMap table, see table 'CMap', 'name' in OpenType [Font](../../aspose.font/font/) File specification. |
## Remarks


Should be used to request specific encoding from TTF [Font](../../aspose.font/font/). 
## See Also

* Class [IEncodingParameters](../../aspose.font/iencodingparameters/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
