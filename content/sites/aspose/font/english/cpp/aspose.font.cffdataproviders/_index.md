---
title: Aspose::Font::CffDataProviders namespace
linktitle: Aspose::Font::CffDataProviders
second_title: Aspose.Font for C++
description: 'How to use Aspose::Font::CffDataProviders namespace in C++.'
type: docs
weight: 300
url: /cpp/aspose.font.cffdataproviders/
---



## Classes

| Class | Description |
| --- | --- |
| [CffPrivateDictDataProvider](./cffprivatedictdataprovider/) |  |
| [CffTopDictDataProvider](./cfftopdictdataprovider/) |  |
| [ICffIndexDataProvider](./icffindexdataprovider/) | Basic interface for accessing INDEX structures of CFF fonts. |
| [IStringIndexAdapter](./istringindexadapter/) |  |
| [NameIndexDataProvider](./nameindexdataprovider/) | Declares functionality to access CFF Name INDEX structure. |
| [PrivateDictDataProvider](./privatedictdataprovider/) | Declares functionality to read/update CFF Private DICT structure. |
| [StringIndexDataProvider](./stringindexdataprovider/) | Declares functionality to access CFF String INDEX structure. |
| [TopDictDataProvider](./topdictdataprovider/) | Declares functionality to read/update CFF Top DICT structure. |
## Enums

| Enum | Description |
| --- | --- |
| [CffIndexProviderType](./cffindexprovidertype/) | Specifies INDEX structures supported by the index provider interface family. |
| [CffUpdateStringIndexStrategy](./cffupdatestringindexstrategy/) | Specifies how to add strings to CFF String INDEX storage. When we try to add some string into CFF String INDEX, there may be situation that this string is already present in String INDEX. Using option [SearchForDuplicates](./cffupdatestringindexstrategy/) we can force search over String INDEX to detect whether this string is already present or not. This approach saves space in the String INDEX structure, but requires more time to add the string. |
