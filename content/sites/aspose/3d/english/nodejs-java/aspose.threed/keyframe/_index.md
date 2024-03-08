---
title: KeyFrame 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/keyframe/
---
## KeyFrame class

  A key frame is mainly defined by a time and a value, for some interpolation types, tangent/tension/bias/continuity is also used by calculating the final sampled value.  Sampled values in a non-key-frame time position is interpolated by key-frames between the previous and next key-frames  Value before/after the first/last key-frame are calculated by the Extrapolation class.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(curve, time) | Create a new key frame on specified curve | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| curve | KeyframeSequence | The curve that the key frame will be created on |
| time | Number | The time position of the key frame |

 **Result:**



---


### getTime{#getTime}

| Name | Description |
| --- | --- |
| getTime() | Gets or sets the time position of list.data[index] key frame, measured in seconds. The time. | 

 **Result:**



---


### setTime{#setTime}

| Name | Description |
| --- | --- |
| setTime(value) | Gets or sets the time position of list.data[index] key frame, measured in seconds. The time. | 

 **Result:**



---


### getValue{#getValue}

| Name | Description |
| --- | --- |
| getValue() | Gets or sets the key-frame's value. The value. | 

 **Result:**



---


### setValue{#setValue}

| Name | Description |
| --- | --- |
| setValue(value) | Gets or sets the key-frame's value. The value. | 

 **Result:**



---


### getInterpolation{#getInterpolation}

| Name | Description |
| --- | --- |
| getInterpolation() | Gets or sets the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated. The value of the property is Interpolation integer constant.The interpolation. | 

 **Result:**



---


### setInterpolation{#setInterpolation}

| Name | Description |
| --- | --- |
| setInterpolation(value) | Gets or sets the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated. The value of the property is Interpolation integer constant.The interpolation. | 

 **Result:**



---


### getTangentWeightMode{#getTangentWeightMode}

| Name | Description |
| --- | --- |
| getTangentWeightMode() | Gets or sets the key's tangent weight mode. The out tangent or the next in tangent can be customized by select correct WeightedModeThe value of the property is WeightedMode integer constant.The tangent weight mode. | 

 **Result:**



---


### setTangentWeightMode{#setTangentWeightMode}

| Name | Description |
| --- | --- |
| setTangentWeightMode(value) | Gets or sets the key's tangent weight mode. The out tangent or the next in tangent can be customized by select correct WeightedModeThe value of the property is WeightedMode integer constant.The tangent weight mode. | 

 **Result:**



---


### getStepMode{#getStepMode}

| Name | Description |
| --- | --- |
| getStepMode() | Gets or sets the key's step mode. If the interpolation type is Interpolation.CONSTANT, list.data[index] decides which key-frame's value will be used during interpolation. A StepMode.PREVIOUS_VALUE means the left key-frame's value will be used A StepMode.NEXT_VALUE means the next right key-frame's value will be used The value of the property is StepMode integer constant.The step mode. | 

 **Result:**



---


### setStepMode{#setStepMode}

| Name | Description |
| --- | --- |
| setStepMode(value) | Gets or sets the key's step mode. If the interpolation type is Interpolation.CONSTANT, list.data[index] decides which key-frame's value will be used during interpolation. A StepMode.PREVIOUS_VALUE means the left key-frame's value will be used A StepMode.NEXT_VALUE means the next right key-frame's value will be used The value of the property is StepMode integer constant.The step mode. | 

 **Result:**



---


### getNextInTangent{#getNextInTangent}

| Name | Description |
| --- | --- |
| getNextInTangent() | Gets or sets the next in(left) tangent on this key frame. | 

 **Result:**



---


### setNextInTangent{#setNextInTangent}

| Name | Description |
| --- | --- |
| setNextInTangent(value) | Gets or sets the next in(left) tangent on this key frame. | 

 **Result:**



---


### getOutTangent{#getOutTangent}

| Name | Description |
| --- | --- |
| getOutTangent() | Gets or sets the out(right) tangent on this key frame. | 

 **Result:**



---


### setOutTangent{#setOutTangent}

| Name | Description |
| --- | --- |
| setOutTangent(value) | Gets or sets the out(right) tangent on this key frame. | 

 **Result:**



---


### getOutWeight{#getOutWeight}

| Name | Description |
| --- | --- |
| getOutWeight() | Gets or sets the out(right) weight on this key frame. | 

 **Result:**



---


### setOutWeight{#setOutWeight}

| Name | Description |
| --- | --- |
| setOutWeight(value) | Gets or sets the out(right) weight on this key frame. | 

 **Result:**



---


### getNextInWeight{#getNextInWeight}

| Name | Description |
| --- | --- |
| getNextInWeight() | Gets or sets the next in(left) weight on this key frame. | 

 **Result:**



---


### setNextInWeight{#setNextInWeight}

| Name | Description |
| --- | --- |
| setNextInWeight(value) | Gets or sets the next in(left) weight on this key frame. | 

 **Result:**



---


### getTension{#getTension}

| Name | Description |
| --- | --- |
| getTension() | Gets or sets tension used in TCB spline | 

 **Result:**



---


### setTension{#setTension}

| Name | Description |
| --- | --- |
| setTension(value) | Gets or sets tension used in TCB spline | 

 **Result:**



---


### getContinuity{#getContinuity}

| Name | Description |
| --- | --- |
| getContinuity() | Gets or sets the continuity used in TCB spline | 

 **Result:**



---


### setContinuity{#setContinuity}

| Name | Description |
| --- | --- |
| setContinuity(value) | Gets or sets the continuity used in TCB spline | 

 **Result:**



---


### getBias{#getBias}

| Name | Description |
| --- | --- |
| getBias() | Gets or sets the bias used in TCB spline | 

 **Result:**



---


### setBias{#setBias}

| Name | Description |
| --- | --- |
| setBias(value) | Gets or sets the bias used in TCB spline | 

 **Result:**



---


### getIndependentTangent{#getIndependentTangent}

| Name | Description |
| --- | --- |
| getIndependentTangent() | Gets or sets the out and next in tangents are independent. | 

 **Result:**



---


### setIndependentTangent{#setIndependentTangent}

| Name | Description |
| --- | --- |
| setIndependentTangent(value) | Gets or sets the out and next in tangents are independent. | 

 **Result:**



---


### getFlat{#getFlat}

| Name | Description |
| --- | --- |
| getFlat() | Get or set if the key frame is flat. Key frame should be flat if next or previous key frame has the same value. Flat key frame has flat tangents and fixed interpolation. | 

 **Result:**



---


### setFlat{#setFlat}

| Name | Description |
| --- | --- |
| setFlat(value) | Get or set if the key frame is flat. Key frame should be flat if next or previous key frame has the same value. Flat key frame has flat tangents and fixed interpolation. | 

 **Result:**



---


### getTimeIndependentTangent{#getTimeIndependentTangent}

| Name | Description |
| --- | --- |
| getTimeIndependentTangent() | Gets or sets the tangent is time-independent | 

 **Result:**



---


### setTimeIndependentTangent{#setTimeIndependentTangent}

| Name | Description |
| --- | --- |
| setTimeIndependentTangent(value) | Gets or sets the tangent is time-independent | 

 **Result:**



---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() | Gets the string representation of the key frame | 

 **Result:**
String


---



