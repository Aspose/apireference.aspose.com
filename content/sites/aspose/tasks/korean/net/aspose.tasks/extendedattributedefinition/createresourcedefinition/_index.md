---
title: CreateResourceDefinition
second_title: .NET API 참조용 Aspose.Tasks
description: Microsoft Project에서 없음으로 표시되는 단순 확장 속성 정의를 생성하는 팩터리 메서드입니다. CalculationTypeaspose.tasks/extendedattributedefinition/calculationtype/ 와 같다None 리소스에서만 사용할 수 있습니다. 지정해야 합니다.customFieldType fieldId 그리고alias 이 메서드를 호출할 때.
type: docs
weight: 30
url: /ko/net/aspose.tasks/extendedattributedefinition/createresourcedefinition/
---
## CreateResourceDefinition(CustomFieldType, ExtendedAttributeResource, string) {#createresourcedefinition}

Microsoft Project에서 "없음"으로 표시되는 단순 확장 속성 정의를 생성하는 팩터리 메서드입니다. [`CalculationType`](../calculationtype/) 와 같다None 리소스에서만 사용할 수 있습니다. 지정해야 합니다.*customFieldType* ,*fieldId* 그리고*alias* 이 메서드를 호출할 때.

```csharp
public static ExtendedAttributeDefinition CreateResourceDefinition(CustomFieldType customFieldType, 
    ExtendedAttributeResource fieldId, string alias)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| customFieldType | CustomFieldType | 지정된[`CustomFieldType`](../../customfieldtype/) 유형. |
| fieldId | ExtendedAttributeResource | 지정된[`ExtendedAttributeResource`](../../extendedattributeresource/) 필드 아이디. |
| alias | String | 지정된String 별명. |

### 반환 값

의 생성된 인스턴스[`ExtendedAttributeDefinition`](../) 지정된 클래스*customFieldType* ,*fieldId* 그리고*alias*.

### 예

이 예를 사용하여 사용자 정의 텍스트 필드 정의를 생성합니다.

```csharp
var resourceTextAttr = ExtendedAttributeDefinition.CreateResourceDefinition(CustomFieldType.Text, ExtendedAttributeResource.Text27, "My custom field");
project.ExtendedAttributes.Add(resourceTextAttr);
```

### 또한보십시오

* enum [CustomFieldType](../../customfieldtype/)
* enum [ExtendedAttributeResource](../../extendedattributeresource/)
* class [ExtendedAttributeDefinition](../)
* 네임스페이스 [Aspose.Tasks](../../extendedattributedefinition/)
* 집회 [Aspose.Tasks](../../../)

---

## CreateResourceDefinition(ExtendedAttributeResource, string) {#createresourcedefinition_1}

Microsoft Project에서 "없음"으로 표시되는 단순 확장 속성 정의를 생성하는 팩터리 메서드입니다. [`CalculationType`](../calculationtype/) 와 같다None 리소스에서만 사용할 수 있습니다. 지정해야 합니다.*fieldId* 그리고*alias* 이 메소드를 호출할 때. 필드 유형은 필드 id. 에서 유추됩니다.

```csharp
public static ExtendedAttributeDefinition CreateResourceDefinition(
    ExtendedAttributeResource fieldId, string alias)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| fieldId | ExtendedAttributeResource | 지정된[`ExtendedAttributeResource`](../../extendedattributeresource/) 필드 아이디. |
| alias | String | 지정된String 별명. |

### 반환 값

의 생성된 인스턴스[`ExtendedAttributeDefinition`](../) 지정된 클래스*fieldId* 그리고*alias*.

### 예

이 예를 사용하여 사용자 정의 텍스트 필드 정의를 생성합니다.

```csharp
var resourceTextAttr = ExtendedAttributeDefinition.CreateResourceDefinition(ExtendedAttributeResource.Text27, "My custom field");
project.ExtendedAttributes.Add(resourceTextAttr);
```

### 또한보십시오

* enum [ExtendedAttributeResource](../../extendedattributeresource/)
* class [ExtendedAttributeDefinition](../)
* 네임스페이스 [Aspose.Tasks](../../extendedattributedefinition/)
* 집회 [Aspose.Tasks](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Tasks.dll -->
