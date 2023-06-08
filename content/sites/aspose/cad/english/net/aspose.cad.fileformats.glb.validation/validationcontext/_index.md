---
title: Struct ValidationContext
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Validation.ValidationContext struct. Utility class used in the process of model validation
type: docs
weight: 11460
url: /net/aspose.cad.fileformats.glb.validation/validationcontext/
---
## ValidationContext structure

Utility class used in the process of model validation.

```csharp
public struct ValidationContext
```

## Constructors

| Name | Description |
| --- | --- |
| [ValidationContext](validationcontext/)(ValidationResult) |  |

## Properties

| Name | Description |
| --- | --- |
| [Root](../../aspose.cad.fileformats.glb.validation/validationcontext/root/) { get; } |  |
| [TryFix](../../aspose.cad.fileformats.glb.validation/validationcontext/tryfix/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AreEqual&lt;TValue&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/areequal/)(ValueLocation, TValue, TValue) |  |
| [AreJoints](../../aspose.cad.fileformats.glb.validation/validationcontext/arejoints/)(ValueLocation, IList&lt;Vector4&gt;, int) |  |
| [AreNormals](../../aspose.cad.fileformats.glb.validation/validationcontext/arenormals/)(ValueLocation, IList&lt;Vector3&gt;) |  |
| [ArePositions](../../aspose.cad.fileformats.glb.validation/validationcontext/arepositions/)(ValueLocation, IList&lt;Vector3&gt;) |  |
| [AreRotations](../../aspose.cad.fileformats.glb.validation/validationcontext/arerotations/)(ValueLocation, IList&lt;Quaternion&gt;) |  |
| [AreSameReference&lt;TRef&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/aresamereference/)(ValueLocation, TRef, TRef) |  |
| [AreTangents](../../aspose.cad.fileformats.glb.validation/validationcontext/aretangents/)(ValueLocation, IList&lt;Vector4&gt;) |  |
| [EnumsAreEqual&lt;TValue&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/enumsareequal/)(ValueLocation, TValue, TValue) |  |
| [GetContext](../../aspose.cad.fileformats.glb.validation/validationcontext/getcontext/)(JsonSerializable) |  |
| [IsAnyOf](../../aspose.cad.fileformats.glb.validation/validationcontext/isanyof/#isanyof)(ValueLocation, AttributeFormat, params AttributeFormat[]) |  |
| [IsAnyOf&lt;T&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/isanyof/#isanyof_1)(ValueLocation, T, params T[]) |  |
| [IsDefaultOrWithin&lt;TValue&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/isdefaultorwithin/)(ValueLocation, TValue?, TValue, TValue) |  |
| [IsDefined&lt;T&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/isdefined/#isdefined_1)(ValueLocation, T) |  |
| [IsDefined&lt;T&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/isdefined/#isdefined)(ValueLocation, T?) |  |
| [IsGreater&lt;TValue&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/isgreater/)(ValueLocation, TValue, TValue) |  |
| [IsGreaterOrEqual&lt;TValue&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/isgreaterorequal/)(ValueLocation, TValue, TValue) |  |
| [IsInRange&lt;T&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/isinrange/)(ValueLocation, T, T, T) |  |
| [IsJsonSerializable](../../aspose.cad.fileformats.glb.validation/validationcontext/isjsonserializable/)(ValueLocation, object) |  |
| [IsLess&lt;TValue&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/isless/)(ValueLocation, TValue, TValue) |  |
| [IsLessOrEqual&lt;TValue&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/islessorequal/)(ValueLocation, TValue, TValue) |  |
| [IsMatrix](../../aspose.cad.fileformats.glb.validation/validationcontext/ismatrix/)(ValueLocation, ref Matrix4x4, bool, bool) |  |
| [IsMatrix4x3](../../aspose.cad.fileformats.glb.validation/validationcontext/ismatrix4x3/)(ValueLocation, ref Matrix4x4, bool, bool) |  |
| [IsMultipleOf](../../aspose.cad.fileformats.glb.validation/validationcontext/ismultipleof/)(ValueLocation, int, int) |  |
| [IsNormal](../../aspose.cad.fileformats.glb.validation/validationcontext/isnormal/)(ValueLocation, ref Vector3) |  |
| [IsNullOrIndex&lt;T&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/isnullorindex/)(ValueLocation, int?, IReadOnlyList&lt;T&gt;) |  |
| [IsNullOrInRange&lt;T&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/isnullorinrange/)(ValueLocation, int?, int, IReadOnlyList&lt;T&gt;) |  |
| [IsNullOrMatrix](../../aspose.cad.fileformats.glb.validation/validationcontext/isnullormatrix/)(ValueLocation, Matrix4x4?, bool, bool) |  |
| [IsNullOrMatrix4x3](../../aspose.cad.fileformats.glb.validation/validationcontext/isnullormatrix4x3/)(ValueLocation, Matrix4x4?, bool, bool) |  |
| [IsNullOrValidURI](../../aspose.cad.fileformats.glb.validation/validationcontext/isnullorvaliduri/)(ValueLocation, string, params string[]) |  |
| [IsPosition](../../aspose.cad.fileformats.glb.validation/validationcontext/isposition/)(ValueLocation, ref Vector3) |  |
| [IsRotation](../../aspose.cad.fileformats.glb.validation/validationcontext/isrotation/)(ValueLocation, ref Quaternion) |  |
| [IsSetCollection&lt;T&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/issetcollection/)(ValueLocation, IEnumerable&lt;T&gt;) |  |
| [IsTrue](../../aspose.cad.fileformats.glb.validation/validationcontext/istrue/)(ValueLocation, bool, string) |  |
| [IsUndefined&lt;T&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/isundefined/#isundefined_1)(ValueLocation, T) |  |
| [IsUndefined&lt;T&gt;](../../aspose.cad.fileformats.glb.validation/validationcontext/isundefined/#isundefined)(ValueLocation, T?) |  |
| [IsValidURI](../../aspose.cad.fileformats.glb.validation/validationcontext/isvaliduri/)(ValueLocation, string, params string[]) |  |
| [MustBeNull](../../aspose.cad.fileformats.glb.validation/validationcontext/mustbenull/)(ValueLocation, object) |  |
| [NonNegative](../../aspose.cad.fileformats.glb.validation/validationcontext/nonnegative/)(ValueLocation, int?) |  |
| [NotNull](../../aspose.cad.fileformats.glb.validation/validationcontext/notnull/)(ValueLocation, object) |  |
| [That](../../aspose.cad.fileformats.glb.validation/validationcontext/that/)(Action) |  |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Validation](../../aspose.cad.fileformats.glb.validation/)
* assembly [Aspose.CAD](../../)


