package com.alten.store.dto;

import com.alten.store.utils.InventoryStatus;

import java.time.Instant;


public class ProcductDto {
        private Long id;

        private String code;
        private String name;
        private String description;
        private String image;
        private String category;
        private double price;
        private int quantity;
        private String internalReference;
        private Long shellId;
        private InventoryStatus inventoryStatus;
        private int rating;
        private Instant createdAt;
        private Instant updatedAt;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getCode() {
                return code;
        }

        public void setCode(String code) {
                this.code = code;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getImage() {
                return image;
        }

        public void setImage(String image) {
                this.image = image;
        }

        public String getCategory() {
                return category;
        }

        public void setCategory(String category) {
                this.category = category;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public String getInternalReference() {
                return internalReference;
        }

        public void setInternalReference(String internalReference) {
                this.internalReference = internalReference;
        }

        public Long getShellId() {
                return shellId;
        }

        public void setShellId(Long shellId) {
                this.shellId = shellId;
        }

        public InventoryStatus getInventoryStatus() {
                return inventoryStatus;
        }

        public void setInventoryStatus(InventoryStatus inventoryStatus) {
                this.inventoryStatus = inventoryStatus;
        }

        public int getRating() {
                return rating;
        }

        public void setRating(int rating) {
                this.rating = rating;
        }

        public Instant getCreatedAt() {
                return createdAt;
        }

        public void setCreatedAt(Instant createdAt) {
                this.createdAt = createdAt;
        }

        public Instant getUpdatedAt() {
                return updatedAt;
        }

        public void setUpdatedAt(Instant updatedAt) {
                this.updatedAt = updatedAt;
        }




}
