---
title: "пространство имён Aspose::Font"
linktitle: "Aspose::Font"
second_title: "Aspose.Font для C++"
description: "Как использовать пространство имён Aspose::Font в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font/
---



## Классы

| Класс | Описание |
| --- | --- |
| [AssemblyConstants](./assemblyconstants/) | Определяет константы, участвующие в проверке лицензии компонента. Раньше они определялись напрямую как атрибуты сборки, но я перенёс их в отдельный класс, потому что в .NET Compact Framework я не могу получить доступ к атрибутам сборки. Теперь код лицензирования, когда компилируется для .NET Compact Framework, использует эти константы вместо атрибутов сборки. |
| [BuildVersionInfo](./buildversioninfo/) | Предоставляет информацию о текущем названии продукта и версии. |
| [CryptoProvider](./cryptoprovider/) |  |
| [Font](./font/) | Представляет базовый класс [Font](./font/). |
| [FontBBox](./fontbbox/) | Представляет ограничивающий прямоугольник (BBox) [Font](./font/). |
| [FontEnvironment](./fontenvironment/) | Предоставляет информацию о текущей среде и платформе. |
| [FontFactory](./fontfactory/) | Содержит функциональность для открытия шрифтов разных типов и другие методы для создания различных объектов. |
| [FontMetrics](./fontmetrics/) | Представляет метрики [Font](./font/). |
| [ICallbackOperationParams](./icallbackoperationparams/) | Предназначен для хранения различных параметров в сценариях, когда используется интерфейс [ICallbackStartEndOperations](./icallbackstartendoperations/). |
| [ICallbackStartEndOperations](./icallbackstartendoperations/) | Предназначен для использования в сценариях, когда некоторой логике необходимо выполняться до начала метода и после его завершения. Параметры для [StartCallbackOperation(ICallbackOperationParams)](../) и [EndCallbackOperation(ICallbackOperationParams)](../) должны быть определены классами, которые должны наследовать интерфейс [ICallbackOperationParams](./icallbackoperationparams/). |
| [IEncodingParameters](./iencodingparameters/) | Интерфейс [Common](../aspose.font.common/) для поддержки параметров кодирования. Некоторые типы [Font](./font/) могут иметь несколько алгоритмов/карт кодирования. Поэтому этот интерфейс следует использовать для создания конкретных параметров кодирования шрифтов. |
| [IFont](./ifont/) | Объявляет общую функциональность для всех форматов шрифтов. Реализуется классами [Font](./font/). |
| [IFontDefinitionParser](./ifontdefinitionparser/) | Интерфейс [Common](../aspose.font.common/) для парсеров файлов шрифтов. |
| [IFontEncoding](./ifontencoding/) | Определяет интерфейс для кодирования [Font](./font/). |
| [IFontEnvironmentSettings](./ifontenvironmentsettings/) | Представляет функциональность, связанную с настройками, общими для всех шрифтов, созданных библиотекой [Aspose.Font](./) в текущей сессии. |
| [IFontMetrics](./ifontmetrics/) | Определяет интерфейс для инструментов метрик [Font](./font/). |
| [IFontRendering](./ifontrendering/) | Представляет [Font](./font/). |
| [IFontSaver](./ifontsaver/) | Определяет интерфейс для функции сохранения [Font](./font/). |
| [IFontSource](./ifontsource/) | Представляет источник шрифта, часто это коллекция шрифтов, например: файлы ttc, папки и т.д. |
| [IFontSubset](./ifontsubset/) | Представляет интерфейс подмножества шрифта. |
| [IStreamFontParser](./istreamfontparser/) | Предназначен для разбора шрифтов на основе байтов потока, предоставляемых объектом Stream. |
| [ISupportsNameAddressing](./isupportsnameaddressing/) | Определяет члены, специфичные для кодировок, поддерживающих адресацию по именам глифов. |
| [IUnicodeList](./iunicodelist/) | Представляет список Unicode. |
| [License](./license/) | Предоставляет методы лицензирования компонента. |
| [Metered](./metered/) | Предоставляет методы установки измеряемого ключа. |
| [MeteredBillingService](./meteredbillingservice/) | Этот внутренний класс используется для обработки состояния измерения клиента. |
| [MeteredCountService](./meteredcountservice/) | Этот внутренний класс используется для обработки данных о потреблении клиента, единица измерения — МБ. |
| [MultiLanguageString](./multilanguagestring/) | Представляет многоязычную строку. |
| [NameToCodeMap](./nametocodemap/) | Представляет отображение имени в код. |
| [TransformationMatrix](./transformationmatrix/) | Represents 3x3 transformation matrix | A B 0 |  | C D 0 |  | TX TY 1 | . |
## Enums

| Перечисление | Описание |
| --- | --- |
| [EditionType](./editiontype/) | Указывает тип издания лицензии. |
| [FontSavingFormats](./fontsavingformats/) | Указывает тип [Font](./font/). |
| [FontStyle](./fontstyle/) | Указывает стиль [Font](./font/). |
| [FontType](./fonttype/) | Указывает тип [Font](./font/). |
| [LicenseState](./licensestate/) | Представляет возможные состояния лицензии. |
| [MeteredState](./meteredstate/) | Представляет возможные измеряемые состояния. |
## Functions

| Функция | Описание |
| --- | --- |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
