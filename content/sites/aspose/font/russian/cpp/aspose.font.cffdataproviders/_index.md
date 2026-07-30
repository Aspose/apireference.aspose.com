---
title: "пространство имён Aspose::Font::CffDataProviders"
linktitle: "Aspose::Font::CffDataProviders"
second_title: "Aspose.Font для C++"
description: "Как использовать пространство имён Aspose::Font::CffDataProviders в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.font.cffdataproviders/
---



## Классы

| Класс | Описание |
| --- | --- |
| [CffPrivateDictDataProvider](./cffprivatedictdataprovider/) |  |
| [CffTopDictDataProvider](./cfftopdictdataprovider/) |  |
| [ICffIndexDataProvider](./icffindexdataprovider/) | Базовый интерфейс для доступа к структурам INDEX шрифтов CFF. |
| [IStringIndexAdapter](./istringindexadapter/) |  |
| [NameIndexDataProvider](./nameindexdataprovider/) | Объявляет функциональность для доступа к структуре CFF Name INDEX. |
| [PrivateDictDataProvider](./privatedictdataprovider/) | Объявляет функциональность для чтения/обновления структуры CFF Private DICT. |
| [StringIndexDataProvider](./stringindexdataprovider/) | Объявляет функциональность для доступа к структуре CFF String INDEX. |
| [TopDictDataProvider](./topdictdataprovider/) | Объявляет функциональность для чтения/обновления структуры CFF Top DICT. |
## Enums

| Перечисление | Описание |
| --- | --- |
| [CffIndexProviderType](./cffindexprovidertype/) | Указывает структуры INDEX, поддерживаемые семейством интерфейсов поставщика индекса. |
| [CffUpdateStringIndexStrategy](./cffupdatestringindexstrategy/) | Указывает, как добавлять строки в хранилище CFF String INDEX. Когда мы пытаемся добавить какую-то строку в CFF String INDEX, может возникнуть ситуация, когда эта строка уже присутствует в String INDEX. Используя параметр [SearchForDuplicates](./cffupdatestringindexstrategy/), мы можем принудительно выполнить поиск по String INDEX, чтобы определить, присутствует ли эта строка уже или нет. Этот подход экономит место в структуре String INDEX, но требует больше времени для добавления строки. |
