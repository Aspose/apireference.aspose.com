---
title: "NameId"
second_title: "Справочник API Aspose.Font for Java"
description: "Перечисление NameId."
type: docs
weight: 67
url: /ru/java/com.aspose.font/nameid/
---
**Inheritance:**
java.lang.Object
```
public final class NameId
```

Перечисление NameId.
## Поля

| Поле | Описание |
| --- | --- |
| [CompatibleFull](#CompatibleFull) | 18 Compatible Full (только Macintosh); На Macintosh имя меню формируется с использованием ресурса шрифта. |
| [CopyrightNotice](#CopyrightNotice) | 0 Уведомление об авторском праве. |
| [DarkBackground](#DarkBackground) | Этот идентификатор, если используется в массиве Palette Labels таблицы CPAL\\u2019s, указывает, что соответствующая цветовая палитра в таблице CPAL подходит для использования со шрифтом при отображении его на темном фоне, например черном. |
| [Description](#Description) | 10 Описание; описание гарнитуры. |
| [DesignerName](#DesignerName) | 9 Дизайнер; имя дизайнера шрифта. |
| [FontFamily](#FontFamily) | 1 Семейство шрифтов. |
| [FontSubfamily](#FontSubfamily) | 2 Подсемейство шрифта. |
| [FullName](#FullName) | 4 Полное название шрифта. |
| [LicenseDescription](#LicenseDescription) | 13 Описание лицензии; описание того, как шрифт может быть законно использован, или различные примеры сценариев лицензированного использования. |
| [LicenseInfoUrl](#LicenseInfoUrl) | 14 URL информации о лицензии, где можно найти дополнительную информацию о лицензировании. |
| [LightBackground](#LightBackground) | Этот ID, если используется в массиве меток палитры таблицы CPAL\\u2019s Palette Labels Array, указывает, что соответствующая цветовая палитра в таблице CPAL подходит для использования со шрифтом при отображении его на светлом фоне, например белом. |
| [ManufacturerName](#ManufacturerName) | 8 Название производителя. |
| [PostScriptCID](#PostScriptCID) | Его наличие в шрифте означает, что nameID 6 содержит название шрифта PostScript, которое должно использоваться с вызовом \\u201ccomposefont\\u201d для вызова шрифта в интерпретаторе PostScript. |
| [PostScriptName](#PostScriptName) | 6 PostScript‑название шрифта. |
| [PreferredFamily](#PreferredFamily) | 15 Зарезервировано 16 Предпочтительное семейство (только Windows); в Windows название семейства отображается в меню шрифтов; название подсемейства представляется как название стиля. |
| [PreferredSubfamily](#PreferredSubfamily) | 17 Предпочтительное подсемейство (только Windows); в Windows название семейства отображается в меню шрифтов; название подсемейства представляется как название стиля. |
| [SampleText](#SampleText) | 19 Пример текста. |
| [TrademarkNotice](#TrademarkNotice) | 7 Уведомление о товарном знаке. |
| [UniqueFontId](#UniqueFontId) | 3 Спецификация Apple: уникальная идентификация подсемейства. 3 Спецификация MS: уникальный идентификатор шрифта. |
| [UrlDesigner](#UrlDesigner) | 12 URL дизайнера шрифта (с протоколом, например http://, ftp://) |
| [UrlVendor](#UrlVendor) | 11 URL поставщика шрифта (с протоколом, например http://, ftp://). |
| [VariationsPostScriptNamePrefix](#VariationsPostScriptNamePrefix) | Если присутствует в переменном шрифте, может использоваться как префикс семейства в алгоритме генерации PostScript‑названий для вариативных шрифтов. |
| [Version](#Version) | 5 Версия таблицы имён. |
| [WwsFamilyName](#WwsFamilyName) | Используется для предоставления семейного названия, соответствующего WWS, если записи для ID 16 и 17 не соответствуют модели WWS. |
| [WwsSubfamilyName](#WwsSubfamilyName) | В сочетании с ID 21 этот идентификатор предоставляет подсемейное название, соответствующее WWS (отражающее только атрибуты веса, ширины и наклона), если записи для ID 16 и 17 не соответствуют модели WWS. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromId(int id)](#fromId-int-) | Создаёт идентификатор имени из целочисленного значения. |
| [getClass()](#getClass--) |  |
| [getId()](#getId--) | Получить целочисленное значение. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CompatibleFull {#CompatibleFull}
```
public static final NameId CompatibleFull
```


18 Совместимое полное (только Macintosh); в Macintosh название меню формируется с использованием ресурса шрифта. Обычно оно совпадает с полным названием. Если вы хотите, чтобы название шрифта отображалось иначе, чем полное название, можно вставить совместимое полное название в ID 18. Это название не используется самой Mac OS, но может использоваться разработчиками приложений (например, Adobe).

### CopyrightNotice {#CopyrightNotice}
```
public static final NameId CopyrightNotice
```


0 Уведомление об авторском праве.

### DarkBackground {#DarkBackground}
```
public static final NameId DarkBackground
```


Этот идентификатор, если используется в массиве Palette Labels таблицы CPAL\\u2019s, указывает, что соответствующая цветовая палитра в таблице CPAL подходит для использования со шрифтом при отображении его на темном фоне, например черном.

### Description {#Description}
```
public static final NameId Description
```


10 Описание; описание гарнитуры. Может содержать информацию о версии, рекомендации по использованию, историю, особенности и т.д.

### DesignerName {#DesignerName}
```
public static final NameId DesignerName
```


9 Дизайнер; имя дизайнера шрифта.

### FontFamily {#FontFamily}
```
public static final NameId FontFamily
```


1 Семейство шрифтов. Эта строка — название семейства шрифта, которое пользователь видит на платформах Macintosh.

### FontSubfamily {#FontSubfamily}
```
public static final NameId FontSubfamily
```


2 Font Subfamily. Эта строка — семейство шрифтов, которое пользователь видит на платформах Macintosh.

### FullName {#FullName}
```
public static final NameId FullName
```


4 Полное название шрифта.

### LicenseDescription {#LicenseDescription}
```
public static final NameId LicenseDescription
```


13 License description; описание того, как шрифт может быть законно использован, или различные примеры сценариев лицензированного использования. Это поле должно быть написано простым языком, а не юридическим жаргоном.

### LicenseInfoUrl {#LicenseInfoUrl}
```
public static final NameId LicenseInfoUrl
```


14 URL информации о лицензии, где можно найти дополнительную информацию о лицензировании.

### LightBackground {#LightBackground}
```
public static final NameId LightBackground
```


Этот ID, если используется в массиве меток палитры таблицы CPAL\\u2019s Palette Labels Array, указывает, что соответствующая цветовая палитра в таблице CPAL подходит для использования со шрифтом при отображении его на светлом фоне, например белом.

### ManufacturerName {#ManufacturerName}
```
public static final NameId ManufacturerName
```


8 Название производителя.

### PostScriptCID {#PostScriptCID}
```
public static final NameId PostScriptCID
```


Его наличие в шрифте означает, что nameID 6 содержит название шрифта PostScript, которое должно использоваться с вызовом \\u201ccomposefont\\u201d для вызова шрифта в интерпретаторе PostScript.

### PostScriptName {#PostScriptName}
```
public static final NameId PostScriptName
```


6 PostScript name of the Font. Примечание: у шрифта может быть только одно имя PostScript, и оно должно быть в ASCII.

### PreferredFamily {#PreferredFamily}
```
public static final NameId PreferredFamily
```


15 Reserved 16 Preferred Family (только Windows); в Windows имя семейства отображается в меню шрифтов; имя подсемейства представляется как название стиля. По историческим причинам семейства шрифтов содержали максимум четыре стиля, но дизайнеры шрифтов могут объединять более четырёх шрифтов в одно семейство. Идентификаторы Preferred Family и Preferred Subfamily позволяют дизайнерам включать предпочтительные группировки семейства/подсемейства. Эти идентификаторы присутствуют только если они отличаются от идентификаторов 1 и 2.

### PreferredSubfamily {#PreferredSubfamily}
```
public static final NameId PreferredSubfamily
```


17 Preferred Subfamily (только Windows); в Windows имя семейства отображается в меню шрифтов; имя подсемейства представляется как название стиля. По историческим причинам семейства шрифтов содержали максимум четыре стиля, но дизайнеры шрифтов могут объединять более четырёх шрифтов в одно семейство. Идентификаторы Preferred Family и Preferred Subfamily позволяют дизайнерам включать предпочтительные группировки семейства/подсемейства. Эти идентификаторы присутствуют только если они отличаются от идентификаторов 1 и 2.

### SampleText {#SampleText}
```
public static final NameId SampleText
```


19 Sample text. Это может быть название шрифта или любой другой текст, который дизайнер считает лучшим образцом для демонстрации внешнего вида шрифта.

### TrademarkNotice {#TrademarkNotice}
```
public static final NameId TrademarkNotice
```


7 Уведомление о товарном знаке.

### UniqueFontId {#UniqueFontId}
```
public static final NameId UniqueFontId
```


3 Спецификация Apple: уникальная идентификация подсемейства. 3 Спецификация MS: уникальный идентификатор шрифта.

### UrlDesigner {#UrlDesigner}
```
public static final NameId UrlDesigner
```


12 URL дизайнера шрифта (с протоколом, например http://, ftp://)

### UrlVendor {#UrlVendor}
```
public static final NameId UrlVendor
```


11 URL поставщика шрифта (с протоколом, например, http://, ftp://). Если в URL встроен уникальный серийный номер, его можно использовать для регистрации шрифта.

### VariationsPostScriptNamePrefix {#VariationsPostScriptNamePrefix}
```
public static final NameId VariationsPostScriptNamePrefix
```


Если присутствует в переменном шрифте, может использоваться как префикс семейства в алгоритме генерации PostScript‑названий для вариативных шрифтов.

### Version {#Version}
```
public static final NameId Version
```


5 Версия таблицы имён.

### WwsFamilyName {#WwsFamilyName}
```
public static final NameId WwsFamilyName
```


Используется для предоставления семейного названия, соответствующего WWS, если записи для ID 16 и 17 не соответствуют модели WWS.

### WwsSubfamilyName {#WwsSubfamilyName}
```
public static final NameId WwsSubfamilyName
```


В сочетании с ID 21 этот идентификатор предоставляет подсемейное название, соответствующее WWS (отражающее только атрибуты веса, ширины и наклона), если записи для ID 16 и 17 не соответствуют модели WWS.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fromId(int id) {#fromId-int-}
```
public static NameId fromId(int id)
```


Создаёт идентификатор имени из целочисленного значения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| id | int | Целочисленное значение. |

**Returns:**
[NameId](../../com.aspose.font/nameid) - The name id.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getId() {#getId--}
```
public int getId()
```


Получить целочисленное значение.

**Returns:**
int - Целочисленное значение.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

