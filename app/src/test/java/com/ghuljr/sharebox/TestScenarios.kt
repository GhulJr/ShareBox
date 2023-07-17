package com.ghuljr.sharebox

import org.junit.Test

import org.junit.Assert.*

/* TODO: how to send data?
* 1. P2P with WiFi direct - https://developer.android.com/training/connect-devices-wirelessly/wifi-direct
* 2. Bluetooth - https://stackoverflow.com/questions/23945171/bluetooth-connection-without-pairing
* 3. QR Code
* 4. Nearby connections - https://developers.google.com/nearby/connections/overview
* */
class TestScenarios {

    /** TODO: create scenarios for following topics
     * 1. App modes and its transitions (shopping/editing modes). Also validating that specific actions can be made only in specific mode
     * 2. Generating QR code (if it will be possible to unit test, if not write UI)
     * 3. Scanning QR code (as above)
     * 4. Sending QR code/URI to generate data (as above)
     * 5. Checking/unchecking items in shopping/editing modes, considering their order should be changed
     * 6. Adding/deleting/editing items in editing mode in realtime
     * 7. Changing items order in editing mode
     * 8. Checked/unchecked items count
     * 9. Deleting the whole page with delete action or when other list is scanned
     * 10. Clicking enter should move to the next item
     * 11. Realtime items synchronisation? I mean, showing that changes are edited correctly
     * 12. Undo redo? Idk if it is needed, but might be cool idea to make some kind of timestamps/batches of text to remember. It could be made
     *     to work for specific period of time or amount of characters/items etc..
     * 13. Maybe to make it even more faster to send, ensure that data is permanently stored in the same tokenized format as the one to send via method of choice?
     */
}