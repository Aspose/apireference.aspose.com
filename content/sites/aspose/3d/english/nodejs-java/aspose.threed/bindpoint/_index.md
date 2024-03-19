---
title: BindPoint 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/bindpoint/
---
## BindPoint class

  A BindPoint is usually created on an object's property, some property types contains multiple component fields(like a Vector3 field),  BindPoint will generate channel for each component field and connects the field to one or more keyframe sequence instance(s) through the channels.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(scene, prop) | Initializes a new instance of the BindPoint class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| scene | Scene | The scene that contains the animation. |
| prop | Property | Property. |

 **Result:**



---


### getProperty{#getProperty}

| Name | Description |
| --- | --- |
| getProperty() | Gets the property associated with the CurveMapping | 

 **Result:**



---


### setProperty{#setProperty}

| Name | Description |
| --- | --- |
| setProperty(value) | Gets the property associated with the CurveMapping | 

 **Result:**



---


### getChannelsCount{#getChannelsCount}

| Name | Description |
| --- | --- |
| getChannelsCount() | Gets the total number of property channels defined in this animation curve mapping. | 

 **Result:**
Number


---


### getName{#getName}

| Name | Description |
| --- | --- |
| getName() | Gets or sets the name. The name. | 

 **Result:**
Number


---


### setName{#setName}

| Name | Description |
| --- | --- |
| setName(value) | Gets or sets the name. The name. | 

 **Result:**
Number


---


### getProperties{#getProperties}

| Name | Description |
| --- | --- |
| getProperties() | Gets the collection of all properties. | 

 **Result:**
Number


---


### get{#get}

| Name | Description |
| --- | --- |
| get(channelName) |  | 

 **Result:**
Number


---


### getKeyframeSequence{#getKeyframeSequence}

| Name | Description |
| --- | --- |
| getKeyframeSequence(channelName) | Gets the first keyframe sequence in specified channel | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| channelName | String | The channel name to find |

 **Result:**
KeyframeSequence


---


### getKeyframeSequences{#getKeyframeSequences}

| Name | Description |
| --- | --- |
| getKeyframeSequences(channelName) | Gets all keyframe sequences in specified channel | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| channelName | String | The channel name to find |

 **Result:**
0, Culture=neutral, PublicKeyToken=f071c641d0b4582b]]


---


### createKeyframeSequence{#createKeyframeSequence}

| Name | Description |
| --- | --- |
| createKeyframeSequence(name) | Creates a new curve and connects it to the first channel of the curve mapping | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | The new sequence's name. |

 **Result:**
KeyframeSequence


---


### bindKeyframeSequence{#bindKeyframeSequence}

| Name | Description |
| --- | --- |
| bindKeyframeSequence(channelName, sequence) | Bind the keyframe sequence to specified channel | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| channelName | String | Which channel the keyframe sequence will be bound to |
| sequence | KeyframeSequence | The keyframe sequence to bind |

 **Result:**
KeyframeSequence


---


### getChannel{#getChannel}

| Name | Description |
| --- | --- |
| getChannel(channelName) | Gets channel by given name | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| channelName | String | The channel name to find |

 **Result:**
AnimationChannel


---


### addChannel{#addChannel}

| Name | Description |
| --- | --- |
| addChannel(name, value) | Adds the specified channel property. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |
| value | Object | Value. |

 **Result:**
boolean


---


### addChannel{#addChannel}

| Name | Description |
| --- | --- |
| addChannel(name, type, value) | Adds the specified channel property. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |
| type | Class | Type. |
| value | Object | Value. |

 **Result:**
boolean


---


### resetChannels{#resetChannels}

| Name | Description |
| --- | --- |
| resetChannels() | Empties the property channels of this animation curve mapping. | 

 **Result:**
boolean


---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() | Formats object to string | 

 **Result:**
String


---


### removeProperty{#removeProperty}

| Name | Description |
| --- | --- |
| removeProperty(property) | Removes a dynamic property. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | Property | Which property to remove |

 **Result:**
boolean


---


### removeProperty{#removeProperty}

| Name | Description |
| --- | --- |
| removeProperty(property) | Remove the specified property identified by name | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  propert | String | null |

 **Result:**
boolean


---


### getProperty{#getProperty}

| Name | Description |
| --- | --- |
| getProperty(property) | Get the value of specified property | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | String | Property name |

 **Result:**
Object


---


### setProperty{#setProperty}

| Name | Description |
| --- | --- |
| setProperty(property, value) | Sets the value of specified property | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | String | Property name |
| value | Object | The value of the property |

 **Result:**
Object


---


### findProperty{#findProperty}

| Name | Description |
| --- | --- |
| findProperty(propertyName) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| propertyName | String | Property name. |

 **Result:**
Property


---



