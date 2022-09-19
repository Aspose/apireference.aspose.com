---
title: CSSPrimitiveValue
second_title: Справочник по Aspose.SVG для .NET API
description: Интерфейс CSSPrimitiveValue представляет одно значение CSS. Этот интерфейс может использоваться для определения значения определенного свойства стиля установленного в данный момент в блоке или для явной установки определенного свойства стиля в блоке. Экземпляр этого интерфейса можно получить из метода getPropertyCSSValue интерфейса CSSStyleDeclaration. Объект CSSPrimitiveValue встречается только в контексте свойства CSS.
type: docs
weight: 480
url: /ru/net/aspose.svg.dom.css/cssprimitivevalue/
---
## CSSPrimitiveValue class

Интерфейс CSSPrimitiveValue представляет одно значение CSS. Этот интерфейс может использоваться для определения значения определенного свойства стиля, установленного в данный момент в блоке, или для явной установки определенного свойства стиля в блоке. Экземпляр этого интерфейса можно получить из метода getPropertyCSSValue интерфейса CSSStyleDeclaration. Объект CSSPrimitiveValue встречается только в контексте свойства CSS.

```csharp
public abstract class CSSPrimitiveValue : CSSValue
```

## Характеристики

| Имя | Описание |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext) { get; set; } | Строковое представление текущего значения. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype) { get; } | Код, определяющий тип значения. |
| [PrimitiveType](../../aspose.svg.dom.css/cssprimitivevalue/primitivetype) { get; } | Тип значения, определенный указанными выше константами. |

## Методы

| Имя | Описание |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals)(object) | Определяет, является ли указанныйObject равен этому экземпляру. |
| abstract [GetCounterValue](../../aspose.svg.dom.css/cssprimitivevalue/getcountervalue)() | Этот метод используется для получения значения счетчика. Если это значение CSS не содержит значения счетчика, возникает исключение DOMException. Модификацию соответствующего свойства стиля можно выполнить с помощью интерфейса счетчика. |
| abstract [GetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/getfloatvalue)(ushort) | Этот метод используется для получения значения с плавающей запятой в указанной единице. Если это значение CSS не содержит значения с плавающей запятой или не может быть преобразовано в указанную единицу измерения, возникает исключение DOMException. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode)() | Возвращает хэш-код для этого экземпляра. |
| abstract [GetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/getintvalue)(ushort) | Этот метод используется для получения значения int в указанных единицах измерения. Если это значение CSS не содержит значение int или не может быть преобразовано в указанную единицу измерения, возникает исключение DOMException. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype)() | Этот метод используется для получения объекта ECMAScript.Type . |
| abstract [GetRectValue](../../aspose.svg.dom.css/cssprimitivevalue/getrectvalue)() | Этот метод используется для получения значения Rect. Если это значение CSS не содержит прямоугольного значения, возникает исключение DOMException. Модификация соответствующего свойства стиля может быть достигнута с помощью интерфейса Rect. |
| abstract [GetRGBColorValue](../../aspose.svg.dom.css/cssprimitivevalue/getrgbcolorvalue)() | Этот метод используется для получения цвета RGB. Если это значение CSS не содержит значение цвета RGB, возникает исключение DOMException. Модификацию соответствующего свойства стиля можно выполнить с помощью интерфейса RGBColor. |
| abstract [GetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/getstringvalue)() | Этот метод используется для получения строкового значения. Если значение CSS не содержит строкового значения, возникает исключение DOMException. |
| abstract [SetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/setfloatvalue)(ushort, float) | Метод установки значения с плавающей запятой в указанной единице. Если свойство, присоединенное к этому значению, не может принять указанную единицу измерения или значение с плавающей запятой, значение останется неизменным и будет возбуждено исключение DOMException. |
| abstract [SetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/setintvalue)(ushort, int) | Метод установки значения int с указанными единицами измерения. Если свойство, связанное с этим значением, не может принять указанную единицу измерения или значение int, значение останется неизменным и будет возбуждено исключение DOMException. |
| abstract [SetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/setstringvalue)(ushort, string) | Метод установки строкового значения с указанными единицами измерения. Если свойство, прикрепленное к этому значению, не может принять указанную единицу измерения или строковое значение, значение останется неизменным и будет возбуждено исключение DOMException. |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring)() | ВозвращаетString который представляет этот экземпляр. |

## Поля

| Имя | Описание |
| --- | --- |
| const [CSS_ATTR](../../aspose.svg.dom.css/cssprimitivevalue/css_attr) | Значение является функцией атрибута. Значение можно получить с помощью метода getStringValue. |
| const [CSS_CH](../../aspose.svg.dom.css/cssprimitivevalue/css_ch) | Значение представляет собой длину (ch). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_CM](../../aspose.svg.dom.css/cssprimitivevalue/css_cm) | Значение представляет собой длину (см). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_COUNTER](../../aspose.svg.dom.css/cssprimitivevalue/css_counter) | Значение представляет собой счетчик или функцию счетчиков. Значение можно получить с помощью метода GetCounterValue. |
| const [CSS_DEG](../../aspose.svg.dom.css/cssprimitivevalue/css_deg) | Значение представляет собой угол (градусы). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_DIMENSION](../../aspose.svg.dom.css/cssprimitivevalue/css_dimension) | Значение представляет собой число с неизвестной размерностью. Значение можно получить с помощью метода getFloatValue. |
| const [CSS_DPCM](../../aspose.svg.dom.css/cssprimitivevalue/css_dpcm) | Значение — количество точек на сантиметр (dpcm). |
| const [CSS_DPI](../../aspose.svg.dom.css/cssprimitivevalue/css_dpi) | Значение — количество точек на дюйм (dpi). |
| const [CSS_DPPX](../../aspose.svg.dom.css/cssprimitivevalue/css_dppx) | Значение — количество точек на единицу пикселей (dppx). |
| const [CSS_EMS](../../aspose.svg.dom.css/cssprimitivevalue/css_ems) | Значение представляет собой длину (ems). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_EXS](../../aspose.svg.dom.css/cssprimitivevalue/css_exs) | Значение представляет собой длину (exs). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_GRAD](../../aspose.svg.dom.css/cssprimitivevalue/css_grad) | Значение представляет собой угол (град). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_HZ](../../aspose.svg.dom.css/cssprimitivevalue/css_hz) | Значение представляет собой частоту (Гц). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_IDENT](../../aspose.svg.dom.css/cssprimitivevalue/css_ident) | Значение является идентификатором. Значение можно получить с помощью метода getStringValue. |
| const [CSS_IN](../../aspose.svg.dom.css/cssprimitivevalue/css_in) | Значение представляет собой длину (в дюймах). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_KHZ](../../aspose.svg.dom.css/cssprimitivevalue/css_khz) | Значение представляет собой частоту (кГц). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_MM](../../aspose.svg.dom.css/cssprimitivevalue/css_mm) | Значение представляет собой длину (мм). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_MS](../../aspose.svg.dom.css/cssprimitivevalue/css_ms) | Значение представляет собой время (мс). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_NUMBER](../../aspose.svg.dom.css/cssprimitivevalue/css_number) | Значение представляет собой простое число. Значение можно получить с помощью метода getFloatValue. |
| const [CSS_PC](../../aspose.svg.dom.css/cssprimitivevalue/css_pc) | Значение представляет собой длину (пк). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_PERCENTAGE](../../aspose.svg.dom.css/cssprimitivevalue/css_percentage) | Значение в процентах. Значение можно получить с помощью метода getFloatValue. |
| const [CSS_PT](../../aspose.svg.dom.css/cssprimitivevalue/css_pt) | Значение представляет собой длину (pt). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_PX](../../aspose.svg.dom.css/cssprimitivevalue/css_px) | Значение представляет собой длину (в пикселях). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_RAD](../../aspose.svg.dom.css/cssprimitivevalue/css_rad) | Значение представляет собой угол (рад). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_RECT](../../aspose.svg.dom.css/cssprimitivevalue/css_rect) | Значение представляет собой прямоугольную функцию. Значение можно получить с помощью метода GetRectValue. |
| const [CSS_REM](../../aspose.svg.dom.css/cssprimitivevalue/css_rem) | Значение представляет собой длину (бэр). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_RGBCOLOR](../../aspose.svg.dom.css/cssprimitivevalue/css_rgbcolor) | Значение представляет собой цвет RGB. Значение можно получить с помощью метода GetRGBColorValue. |
| const [CSS_S](../../aspose.svg.dom.css/cssprimitivevalue/css_s) | Значение представляет собой время (с). Значение можно получить с помощью метода getFloatValue. |
| const [CSS_STRING](../../aspose.svg.dom.css/cssprimitivevalue/css_string) | Значение представляет собой STRING. Значение можно получить с помощью метода getStringValue. |
| const [CSS_UNKNOWN](../../aspose.svg.dom.css/cssprimitivevalue/css_unknown) | Значение не является распознанным значением CSS2. Значение можно получить только с помощью атрибута cssText. |
| const [CSS_URI](../../aspose.svg.dom.css/cssprimitivevalue/css_uri) | Значение представляет собой URI. Значение можно получить с помощью метода getStringValue. |
| const [CSS_VH](../../aspose.svg.dom.css/cssprimitivevalue/css_vh) | Значение представляет собой процент от полной высоты области просмотра. |
| const [CSS_VMAX](../../aspose.svg.dom.css/cssprimitivevalue/css_vmax) | Значение представляет собой процент от ширины или высоты окна просмотра, в зависимости от того, что больше. |
| const [CSS_VMIN](../../aspose.svg.dom.css/cssprimitivevalue/css_vmin) | Значение представляет собой процент от ширины или высоты окна просмотра, в зависимости от того, что меньше. |
| const [CSS_VW](../../aspose.svg.dom.css/cssprimitivevalue/css_vw) | Значение представляет собой процент от полной ширины окна просмотра. |

### Смотрите также

* class [CSSValue](../cssvalue)
* пространство имен [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css)
* сборка [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
