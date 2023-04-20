---
title: Class CSSValue
second_title: .NET API 참조용 Aspose.SVG
description: Aspose.Svg.Dom.Css.CSSValue 수업. 단순하거나 복잡한 값을 나타냅니다. CSSValue 개체는 CSS 속성의 컨텍스트에서만 발생합니다.
type: docs
weight: 490
url: /ko/net/aspose.svg.dom.css/cssvalue/
---
## CSSValue class

단순하거나 복잡한 값을 나타냅니다. CSSValue 개체는 CSS 속성의 컨텍스트에서만 발생합니다.

```csharp
public abstract class CSSValue : DOMObject
```

## 속성

| 이름 | 설명 |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext/) { get; set; } | 현재 값의 문자열 표현입니다. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | 값의 유형을 정의하는 코드. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | 지정된Object 이 인스턴스와 같습니다. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | 이 인스턴스에 대한 해시 코드를 반환합니다. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype/)() | 이 메서드는 ECMAScript 개체를 검색하는 데 사용됩니다.Type . |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | 반환String 이 instance. 를 나타냅니다. |
| [operator ==](../../aspose.svg.dom.css/cssvalue/op_equality/) | ==. 연산자 구현 |
| [operator !=](../../aspose.svg.dom.css/cssvalue/op_inequality/) | 연산자 구현 !=. |

## 필드

| 이름 | 설명 |
| --- | --- |
| const [CSS_CUSTOM](../../aspose.svg.dom.css/cssvalue/css_custom/) | 값은 사용자 지정 값입니다. |
| const [CSS_INHERIT](../../aspose.svg.dom.css/cssvalue/css_inherit/) | 값이 상속되고 cssText에 "상속"이 포함됩니다. |
| const [CSS_PRIMITIVE_VALUE](../../aspose.svg.dom.css/cssvalue/css_primitive_value/) | 값은 프리미티브 값이며 CSSPrimitiveValue 인터페이스의 인스턴스는 이 CSSValue 인터페이스 인스턴스에서 바인딩 특정 캐스팅 방법을 사용하여 얻을 수 있습니다. |
| const [CSS_VALUE_LIST](../../aspose.svg.dom.css/cssvalue/css_value_list/) | 값은 CSSValue 목록이고 CSSValueList 인터페이스의 인스턴스는 이 CSSValue 인터페이스 인스턴스에서 바인딩 특정 캐스팅 방법을 사용하여 얻을 수 있습니다. |

### 또한보십시오

* class [DOMObject](../../aspose.svg.dom/domobject/)
* 네임스페이스 [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* 집회 [Aspose.SVG](../../)


