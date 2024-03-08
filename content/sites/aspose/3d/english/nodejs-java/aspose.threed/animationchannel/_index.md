---
title: AnimationChannel 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/animationchannel/
---
## AnimationChannel class

  A channel maps property's component field to a set of keyframe sequences  @hideconstructor


## Methods

### getComponentType{#getComponentType}

| Name | Description |
| --- | --- |
| getComponentType() | Gets the component field's type | 

 **Result:**



---


### getName{#getName}

| Name | Description |
| --- | --- |
| getName() | Gets the name of the channel | 

 **Result:**



---


### getDefaultValue{#getDefaultValue}

| Name | Description |
| --- | --- |
| getDefaultValue() | Gets or sets the Default value of the channel. If a channel has no keyframe sequences connected, the default value will be used during the animation evaluation. A real scenario: Animation only animates a node's x coordinate, the y and z are not changed, then the default value will be used during full translation evaluation. | 

 **Result:**



---


### setDefaultValue{#setDefaultValue}

| Name | Description |
| --- | --- |
| setDefaultValue(value) | Gets or sets the Default value of the channel. If a channel has no keyframe sequences connected, the default value will be used during the animation evaluation. A real scenario: Animation only animates a node's x coordinate, the y and z are not changed, then the default value will be used during full translation evaluation. | 

 **Result:**



---


### getKeyframeSequences{#getKeyframeSequences}

| Name | Description |
| --- | --- |
| getKeyframeSequences() | Gets all keyframe sequences inside this channel | 

 **Result:**



---


### addKeyframeSequence{#addKeyframeSequence}

| Name | Description |
| --- | --- |
| addKeyframeSequence(sequence) | Adds keyframe sequence to this channel | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| sequence | KeyframeSequence | The keyframe sequence to add. |

 **Result:**



---


### iterator{#iterator}

| Name | Description |
| --- | --- |
| iterator() | Reserved for internal use. | 

 **Result:**



---



