---
title: Enum ValidationErrorCode
second_title: .NET API 참조용 Aspose.Finance
description: Aspose.Finance.Xbrl.Validator.ValidationErrorCode 열거형. 유효성 검사 오류 코드 enum.
type: docs
weight: 8210
url: /ko/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

유효성 검사 오류 코드 enum.

```csharp
public enum ValidationErrorCode
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | SchemaRef 유형이 발생해야 하고 고정된 콘텐츠가 "단순"해야 합니다. |
| SchemaRefNoHref | `1` | SchemaRef에는 href 속성이 있어야 합니다. |
| ContextNoId | `2` | 컨텍스트 ID는 id 속성을 포함해야 합니다. |
| ContextNoEntity | `3` | 엔터티 요소는 컨텍스트 요소의 필수 콘텐츠입니다. |
| ContextEntityNoIdentifier | `4` | 엔터티 요소는 식별자 요소 를 포함해야 합니다. |
| ContextPeriodNoStartTime | `5` | 컨텍스트 기간 유형은 기간이지만 시작 날짜가 없습니다. |
| ContextPeriodNoEndTime | `6` | 컨텍스트 기간 유형은 기간이지만 종료 날짜가 없습니다. |
| ContextPeriodStartAfterEnd | `7` | 컨텍스트 기간 유형이 기간이지만 종료 날짜가 시작 날짜 이전입니다. |
| ContextInstantNoTime | `8` | 컨텍스트 기간 유형이 인스턴트이지만 인스턴트 날짜가 없습니다. |
| ContextScenarioXbrlNamespace | `9` | 컨텍스트 시나리오는 xbrl 네임스페이스 노드를 가질 수 없습니다. |
| ContextScenarioXbrlSubstitutionGroup | `10` | 컨텍스트 시나리오는 xbrl 네임스페이스에 정의된 요소에 대한 대체 그룹에 요소를 가질 수 없습니다. |
| ContextScenarioEmpty | `11` | 컨텍스트 시나리오는 비워둘 수 없습니다." |
| ContextSegmentXbrlNamespace | `12` | 컨텍스트 세그먼트는 xbrl 네임스페이스 노드를 가질 수 없습니다. |
| ContextSegmentXbrlSubstitutionGroup | `13` | 컨텍스트 세그먼트는 xbrl 네임스페이스에 정의된 요소에 대한 대체 그룹의 요소를 가질 수 없습니다. |
| ContextSegmentEmpty | `14` | 컨텍스트 세그먼트는 비어 있을 수 없습니다 |
| ItemNoContext | `15` | 항목에 컨텍스트가 있어야 합니다. |
| ItemPeroidTypeConflictWithContext | `16` | 항목에 컨텍스트와 충돌하는 기간 유형이 있습니다. |
| ItemNumericNoUnit | `17` | 항목은 숫자이며 단위가 있어야 합니다. |
| MonetaryItemNoSingleUnitMeasure | `18` | 항목은 통화 유형이며 단일 단위 측정값을 가져야 합니다. |
| MonetaryItemNoISO4217 | `19` | 항목은 화폐 유형이며 ISO 4217 스타일 단위 측정값을 가져야 합니다. |
| ShareItemNoSingleUnitMeasure | `20` | 항목은 공유 유형이며 단일 단위 측정값을 가져야 합니다. |
| ShareItemNoShareUnitMeasure | `21` | 항목은 공유 유형이며 xbrli:shares 단위 측정값이 있어야 합니다. |
| NillItemWithPrecisionOrDecimals | `22` | 항목이 nil이며 전체 자릿수나 소수가 없어야 합니다. |
| FractionItemWithPrecisionOrDecimals | `23` | 항목은 분수 유형이며 전체 자릿수나 소수가 없어야 합니다. |
| NumericItemWithBothPrecisionAndDecimals | `24` | 항목은 숫자 유형이며 전체 자릿수와 소수점을 모두 포함할 수 없습니다. |
| NumericItemWithoutPrecisionOrDecimals | `25` | 항목은 숫자 유형이며 전체 자릿수 또는 소수점이어야 합니다. |
| NonNumericItemWithPrecisionOrDecimals | `26` | 항목은 숫자 유형이 아니며 전체 자릿수 또는 소수점을 포함할 수 없습니다. |
| FootnoteArcFromNotFound | `27` | Loc. 에서 각주 호를 찾을 수 없습니다. |
| FootnoteArcToNotFound | `28` | 각주 호에서 각주를 찾을 수 없습니다. |
| DefinitionArcFromNotFound | `29` | Loc. 에서 정의 아크를 찾을 수 없습니다. |
| DefinitionArcToNotFound | `30` | 정의 아크는 Loc. 를 찾을 수 없습니다. |
| EssenceAliasDefinitionArcDifferentType | `31` | 에센스-가명 정의 arc는 다른 유형을 가지고 있습니다. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | 에센스-가명 정의 아크는 다른 periodTypes를 가집니다. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | 에센스-별칭 정의 아크의 잔액이 다릅니다. |
| CalculationArcFromNotFound | `34` | Loc. 에서 계산 아크를 찾을 수 없습니다. |
| CalculationArcToNotFound | `35` | 계산 아크는 Loc. 를 찾을 수 없습니다. |
| CalculationArcZeroWeight | `36` | 계산 호의 가중치가 0입니다. |
| CalculationArcSummationItemNonNumeric | `37` | 합계 항목 계산 호에 숫자가 아닌 개념이 있습니다. |
| CalculationArcIllegalBalancecWeight | `38` | 합계 항목 계산 호에 숫자가 아닌 개념이 있습니다. |
| LabelArcFromNotFound | `39` | Loc. 에서 레이블 호를 찾을 수 없습니다. |
| LabelArcToNotFound | `40` | 레이블 아크가 레이블을 찾을 수 없습니다. |
| PresentationArcFromNotFound | `41` | Loc. 에서 프레젠테이션 아크를 찾을 수 없습니다. |
| PresentationArcToNotFound | `42` | 프레젠테이션 아크가 Loc. 를 찾을 수 없습니다. |
| PresentationArcPreferredLabelNotFound | `43` | 프리젠테이션 아크가 preferredLabel. 를 찾을 수 없습니다. |
| ReferenceArcFromNotFound | `44` | Loc. 에서 참조 호를 찾을 수 없습니다. |
| ReferenceArcToNotFound | `45` | 참조 호는 참조를 찾을 수 없습니다. |
| InlineFactMissContext | `46` | 인라인 팩트에서 컨텍스트를 찾을 수 없습니다. |
| InlineFactMissUnit | `47` | 인라인 팩트에서 장치를 찾을 수 없습니다. |
| InlineDuplicatedId | `48` | 인라인 Xbrl 문서에 중복된 ID가 있습니다. |
| InlineRelationshipMissFromRef | `49` | ref. 에서 인라인 관계를 찾을 수 없습니다. |
| InlineRelationshipMissToRef | `50` | ref. 에 대한 인라인 관계를 찾을 수 없습니다. |
| InlineRelationshipIllegalFromRef | `51` | ref. 에서 인라인 관계가 잘못되었습니다. |
| InlineRelationshipIllegalToRef | `52` | 인라인 관계가 ref. 에 적합하지 않습니다. |
| InlineContinuationNotMatch | `53` | 인라인 연속이 일치하지 않습니다. |
| InlineFootnoteNotlang | `54` | 인라인 각주에 언어가 없습니다. |
| InlineFractionIllegalChildElement | `55` | 인라인 분수에 잘못된 하위 요소가 있습니다. |
| InlineFractionIllegalAttrbuites | `56` | 인라인 분수에 잘못된 특성이 있습니다. |
| InlineFractionIllegalAncestor | `57` | 인라인 분수에 잘못된 조상이 있습니다. |
| InlineFractionTermNegative | `58` | 인라인 분수에 음수가 있습니다. |
| InlineHeaderIllegalAncestor | `59` | 인라인 분수에 잘못된 태그가 있습니다. |
| InlineHeaderDisplayNone | `60` | 인라인 헤더 아버지 div 노드에 "display:none" 스타일이 없습니다. |
| InlineHeaderIllegalChildElement | `61` | 인라인 헤더에 둘 이상의 "숨겨진" 요소 또는 둘 이상의 "자원" 요소가 있습니다. |
| InlineNonFractionIllegalAncestor | `62` | 인라인 nonFraction에 잘못된 상위 항목이 있습니다. |
| InlineNonFractionIllegalChildElement | `63` | 인라인 nonFraction에 잘못된 자식 요소가 있습니다. |
| InlineNonFractionIllegalProperties | `64` | 인라인 nonFraction에 잘못된 속성이 있습니다. |
| InlineNonFractionTermNegative | `65` | 인라인 nonFraction에는 음수가 있습니다. |
| InlineTupleIllegalChildElement | `66` | 인라인 튜플에 잘못된 요소가 있습니다. |
| InlineContinuationNoId | `67` | ix:continuation 요소에는 id 속성이 있어야 합니다.. |
| InlineContinuationIllegalAncestor | `68` | ix:continuation 요소는 ix:hidden 요소의 자손이 아니어야 합니다. |
| InlineExcludeIllegalAncestor | `69` | ix:exclude 요소는 적어도 하나의 ix:continuation, ix:footnote 또는 ix:nonNumeric 요소의 자손이어야 합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator/)
* 집회 [Aspose.Finance](../../)


